package com.login.crud.model;
import java.io.Serializable;

public class Response implements Serializable {
	
	private static final long serialVersionUID=5394376835296146678L;
	private String responseMsg;
	private int responseCode;
	private Object data;
	
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
	public Object getdata() {
		return data;
	}
	public void setdata(Object data) {
		this.data = data;
	}
}
