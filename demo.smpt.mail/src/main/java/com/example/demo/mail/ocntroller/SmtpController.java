package com.example.demo.mail.ocntroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mail.dao.Response;
import com.example.demo.mail.dao.SmtpDao;


@CrossOrigin("*")
@RestController
@RequestMapping("/otpsender")
public class SmtpController {
	private SmtpDao dao=new SmtpDao();


	@PostMapping ("/sendEmail")	
	public ResponseEntity<Response>sendEmail(@RequestParam String toEmail){
	System.out.println(toEmail);
		return ResponseEntity.ok(dao.sendEmail(toEmail));
	}


}
