package com.api.book.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.swing.JPopupMenu.Separator;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

//12. iss wali class ko autowire karenge to yeh spring ko pta hona chahiye
@Component //springcontainer iss class ke object ki lifecycle ko apne aap handle krpaye apneaap
public class fileUploadHelper {

    public final String UPLOAD_DIR = "C:\\Users\\HP\\Documents\\Web-Development\\Java-Development\\Spring Boot\\A5. REST API\\A3. REST API\\bootrestbook\\src\\main\\resources\\static\\images"; //13. final rakh rhe kyuki isko change nhi krna
    //windows mai path mai double quotes ke andar kabhibhi single slash kam nhi karega so double karenge isko
    
    //14. yeh boolean function btayega ki file upload hogyi hai ya nhi hui hai.
    public boolean uploadFile(MultipartFile multipartFile){ //yeh wahi object hai jo wahase ayega
        boolean f = false;//by default hume assume karliye ki f ki value false matlab abhi upload nhi hui hai
        
        //15. jab upload hojayegi to iss f ki value true set karedenge aur wahi return karenge.
        try{
/* 
            InputStream is = multipartFile.getInputStream(); //16. inputStream se data read krke apko write krna hai iss wale path pe
            //jitna data arha utne size ka array banayenge
            byte data[]= new byte[is.available()]; //jitni bhi number of bytes present hogi approx woh dedegi
            is.read(data); //data array mai read krhe

            //17. write
            FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+ File.separator +multipartFile.getOriginalFilename()); // File.separator is basically "//"
            //yeh file image folder ke andar chali jayegi
            fos.write(data); //for mai write krna hai aur isme apna data pass krna hai

            //18. jab write hojayega to app fos ko close kr skte ho
            fos.flush();
            fos.close(); */

            //19. ap yahi nio package ki help se kr skte ho.
            Files.copy(multipartFile.getInputStream(), Paths.get(UPLOAD_DIR+ File.separator+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING); //target means kahape file write krni hai. aur options mai likhna hai file kis tarikese write honi chahiye

            f = true; //20. jab yeh sabkuch hojayega to iski value true set kardenge

        } catch(Exception e){
            e.printStackTrace();
        }

        return f;
        //21. iss uploadFile wale function ko fileUploadController mai use karenge
    }
}
