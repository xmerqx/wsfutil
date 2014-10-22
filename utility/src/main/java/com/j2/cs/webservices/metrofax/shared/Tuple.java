package com.j2.cs.webservices.metrofax.shared;

import java.io.Serializable;

public class Tuple<T1,T2> implements Serializable{
	private T1 a;
	private T2 b;
	
	public Tuple(){
		
	}
	
	public Tuple(T1 a, T2 b){
		this.a=a;
		this.b=b;
	}
	
	public T1 getA() {
		return a;
	}
	public void setA(T1 a) {
		this.a = a;
	}
	public T2 getB() {
		return b;
	}
	public void setB(T2 b) {
		this.b = b;
	}
	
	
	

}
