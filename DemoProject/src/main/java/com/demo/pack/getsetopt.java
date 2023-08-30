package com.demo.pack;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class getsetopt {
	static JSONArray arr=new JSONArray();
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in) ;
		
		for(int i=0;i<5;i++) {
			JSONObject obj=new JSONObject();
			System.out.println("Enter your name");
			String name= sc.nextLine();
			obj.put(i, name);
			arr.add(obj);
			}
		System.out.println(arr);
	
	
	}

}
