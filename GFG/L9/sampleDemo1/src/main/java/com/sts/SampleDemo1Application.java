package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleDemo1Application.class, args);
		System.out.println("inside main");
	}
	
	/* if any port is busy? 
	 * 
	 * Microsoft Windows [Version 10.0.19045.2965]
(c) Microsoft Corporation. All rights reserved.       

E:\Comding\Java Dev\sampleDemo1\src\main\java\com\sts>netstat -ano | findstr :80 (command to check which process is using that port)
80
  TCP    0.0.0.0:8080           0.0.0.0:0              LISTENING       12276
  TCP    [::]:8080              [::]:0                 LISTENING       12276    

E:\Comding\Java Dev\sampleDemo1\src\main\java\com\sts>taskkill /F /PID 12276 (command to terminate that process)
SUCCESS: The process with PID 12276 has been terminated.

E:\Comding\Java Dev\sampleDemo1\src\main\java\com\sts>

	 */

}
