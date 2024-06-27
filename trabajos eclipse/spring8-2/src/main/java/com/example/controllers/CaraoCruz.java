package com.example.controllers;

public class CaraoCruz {

	public String Random() {
		int a = (int) Math.floor(Math.random()*2);
		String b;
		if (a==1) {
			b = "cara";}
		else {
			b= "cruz";}
		return b;
	}
}
