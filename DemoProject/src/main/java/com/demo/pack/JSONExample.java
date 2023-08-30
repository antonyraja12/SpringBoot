package com.demo.pack;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

class JSONExample {

	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		JSONObject obj1 =new JSONObject();
		JSONArray arr = new JSONArray();
		obj.put("1", "Batch12");
		obj.put("2", "Batch13");
		
		obj1.put("1", "Antony");
		obj1.put("2", "Sathish");
//		System.out.println(obj);
		arr.add(obj);
		arr.add(obj1);
		System.out.println(arr);
		
	}

}
