package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Demo {
	
	@Value("#{22+11}") 
	private int x;
	
	@Value("#{2+ 4 + 56+ 34}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(25) }") 
	private int z; 
	
	@Value("#{ T(java.lang.Math).E }") 
	private double e; 
	
	@Value("#{ new java.lang.String('Sumit Santape')}") 
	private String name;
	
	//boolean type keliye
	@Value("#{ 8-4 > 3}") //iske andar aisa expression likhna hai jo resulve ho true or false mai. 8>3 is true to isme true inject hojayega
	private boolean isActive; //ab iski toString method bhi generate karo
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	

}
