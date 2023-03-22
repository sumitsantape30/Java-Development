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
	private int z; //1. z ke andar 4 ka sqaure root rakhne wale hai. so muje use krna hoga java.lang.math class
	
	@Value("#{ T(java.lang.Math).E }") //.PI ki bhi value le skte ho
	private double e; //2. for variable. isi tarah variables ki value bhi acces kr skte ho lang.Math class mese. ctrl+shift+t se open hoga class
	
	//3. string integer class ka object kaise invoke kare
	@Value("#{ new java.lang.String('Sumit Santape')}") //string class ka object chahiye to karo new String() sebhi kr skte ho complete name likh skte ho. aur iske andar single quotes lagao coz double quote already bahar laga chuke ho
	private String name;
	
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
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + "]";
	}

}
