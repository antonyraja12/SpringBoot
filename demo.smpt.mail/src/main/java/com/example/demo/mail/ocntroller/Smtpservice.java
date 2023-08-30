package com.example.demo.mail.ocntroller;

import com.example.demo.mail.dao.Response;

public interface Smtpservice {
	public Response  sendEmail(String toEmail);

}
