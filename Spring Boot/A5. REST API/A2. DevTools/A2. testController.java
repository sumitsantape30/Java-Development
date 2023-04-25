package com.jpa.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test") // isko url mai map krdiya. jaisehi aap iss /test run karenge to yeh method run hojayega
	@ResponseBody()
	public String test() {
		int a= 10;
		int b = 10;
		int c = 15;
		return "This is just testing and a + b = "+(a+b);
	}
	
	//jaisehi aap yaha values change karoge or new variables add krke save karoge to woh apne aap save krlega
	
}
