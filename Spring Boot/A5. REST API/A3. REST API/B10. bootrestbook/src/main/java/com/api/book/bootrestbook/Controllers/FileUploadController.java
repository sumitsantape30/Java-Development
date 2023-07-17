package com.api.book.bootrestbook.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.api.book.helper.fileUploadHelper;

@RestController //1. kyuki hum rest api banarhe to yaha restController rakhenge
public class FileUploadController {

    //22. uploadFile function ko yaha use krne keliye fileUploadHelper ka object yaha chahiye hoga.
    @Autowired //23. autowired se apne aap object yahape ajayega
    private fileUploadHelper fileUploadHelper;

    //2. handlers banayenge
    @PostMapping("/upload-file")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file){ //5. isme wahi key pass karo jo postman mai dali hai apne. jo datatype aap use karoge file ko handle krne keliye woh hai multipart file yeh basically ek class hai jo file ko handle karega.
       //6. uss file ki isme sari details ajayegi
       //System.out.println(file.getOriginalFilename());
       //System.out.println(file.getSize());
       //System.out.println(file.getContentType());
       //System.out.println(file.getName());//key ka nam hoga yeh
       //7. postman mai file choose krke send karo to woh details print krdega

       //23. yahape try catch rakhiye, yeh bada wala try catch 23. ane pe hi dalna
       try{

        //validation
        if( file.isEmpty()){//8. agar file khali hui to internal server error bhej denge
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contain file");
        }

        //9. agar aap sirf jpg files hi lena chahte ho
        if(!file.getContentType().equals("image/jpeg")){ //means agar image jpg nhi hogi to internal server erro dege
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only jpeg content type are allowed.");
        }

        //10. yahape aake ab upload wala kam krna hai
        //file upload code

        //Where to upload the file on server : UPLOAD_DIRECTORY= (yaha folder ki path dalna sari files wahipe store hogi)
        //C:\Users\HP\Documents\Web-Development\Java-Development\Spring Boot\A5. REST API\A3. REST API\bootrestbook\src\main\resources\static\images
        //11. mai ek helper class banaunga aur usme file upload sara code likhenge fir uski methods yaha call karenge
        //so create helper/fileUploadHelper.java

        //25. apne function call karo aur multiPart ka object file mai rakha tha to woh pass karenge
        boolean f = fileUploadHelper.uploadFile(file);
        if(f){ //26. true aya hoga to file upload hogyi hogi to aap success de skte ho
            return ResponseEntity.ok("File is successfully uploaded.");
        }

        }catch(Exception e){ //24. catch block

            e.printStackTrace();
        }

        //return ResponseEntity.ok("working"); //3. abhi bas dekhre ki yeh endpoint kam krha ki nhi
        //isko aisehi run krke dekhan. ab mujhe file wahase bhejni hai aur yaha receive krke image folder mai upload krni hai
        //open postman:body > form-data isme key mai file type karo aur tick karo aur aage wale dropdown mai file select karo.
        //so wahase jo file select ki woh yaha receive krna hai
        
        //4. @RequestParam use karo kyuki form mai data arha hai
        
        //27. agar false hua means file upload nhi hui to invernal server error de denge
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong! Try again");

    }
    
} 
