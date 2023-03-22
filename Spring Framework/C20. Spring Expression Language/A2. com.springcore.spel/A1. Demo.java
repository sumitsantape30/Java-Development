package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //object banayega that'll be stored in demo
public class Demo {
	
	@Value("#{22+11}") //isme hum pass kr skte hai expression language
	private int x;
	
	@Value("#{2+ 4 + 56+ 34}")
	private int y;
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
		return "Demo [x=" + x + ", y=" + y + "]";
	}
	
	

}
