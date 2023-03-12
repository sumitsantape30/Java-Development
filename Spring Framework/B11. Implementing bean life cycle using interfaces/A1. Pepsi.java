Implementing bean lifecycle using interfaces, InitializingBean DisposableBean.

Bean create karni hai aur usme interface implement krna hai pehla interface hai "InitializingBean" yeh ek method dega usko override krna padega. this method is for initialization.
aur DisposableBean dega apko destroy wali property. yeh destroy wala function provide karega. 

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//1. pehle Pepsi class banao sa setter getter sab daldo then likho implements InitializingBean. fir aap afterPropertiesSet implement karoge woh Pepsi pe jo error arha tha uske upar hover krke 
public class Pepsi implements InitializingBean,DisposableBean {
	//4. destroy keliye yaha aplo comma lagake likhna hoga DisposableBean then uski bhi unimplemented method add karo
	
	private double price;

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//2. afterPropertiesSet mean property set krne ke bad yeh method chalega means yeh init ka kam karega
	public void afterPropertiesSet() throws Exception {
		//init
		System.out.println("Taking Pepsi: init");
	}//3. yeh sirf init keliye functionality deta hai 

	//5. 
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Going to put bottle in shop after drinking");
	}

}
