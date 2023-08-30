package com.jpa.crud.model;


import java.io.Serializable;

public class Response implements Serializable {
	
	private static final long serialVersionUID=5394376835296146678L;
	private String responseMsg;
	private int responseCode;
	private Object jdata;
	private String data;
	
	public static final int RESPONSE_SUCCESS=0;
	public static final int RESPONSE_ERROR=1;
	public String getResponseMsg() {
		return responseMsg;
	}
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public Object getJdata() {
		return jdata;
	}
	public void setJdata(Object jdata) {
		this.jdata = jdata;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public static int getResponseError() {
		return RESPONSE_ERROR;
	}
	
}