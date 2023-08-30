package com.example.demo.mail.dao;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.example.demo.mail.ocntroller.Smtpservice;



public class SmtpDao implements Smtpservice {
	
	Response res=new Response();

	
		@Autowired
		private JavaMailSender javaMailSender;

		@Override
		public Response sendEmail(String toEmail) {
			Random rm = new Random();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 4; i++) {
				sb.append(rm.nextInt(10));
			}
			String otpString = sb.toString();

			try {
				String fromEmail = "antonyraja.dev@gmail.com";
				String emailSubject = "Otp From Antony";
				String emailText = "Greetings,\n \t Thanks for contacting. \n \t Your OTP is '" + otpString
						+ "' .\n \n  Thanks and Regards, \n  AntonyRaja A";

				SimpleMailMessage smm = new SimpleMailMessage();
				smm.setTo(toEmail);
				smm.setFrom(fromEmail);
				smm.setSubject(emailSubject);
				smm.setText(emailText);
				System.out.println(smm.toString());

				javaMailSender.send(smm);

				res.setResponseMsg("Success");
				res.setResponseCode(200);
				res.setData("Email has been send Successfully");

			} catch (Exception e) {
				e.printStackTrace();
				res.setResponseCode(500);
				res.setResponseMsg("Error");
			}

			return res;
		

		 
	}

}
