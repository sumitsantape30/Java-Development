package com.sts;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DemoService {

	/*
	 * If this DemoService is autowired in multiple controllers it'll have different different objects coz the scope is prototype.
	 * if you dont put protype it'll create a single object and that object will be used in the controllers.
	 * so Scope annotation is applicable to both function and class.
	 */
}
