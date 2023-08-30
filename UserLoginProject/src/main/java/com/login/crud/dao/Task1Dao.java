package com.login.crud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.login.crud.model.Response;
import com.login.crud.model.Task1Model;
import com.login.crud.service.Task1Service;

@Component
public class Task1Dao implements Task1Service {

	String url = "jdbc:mysql://127.0.0.1:3306/crud", username = "root", password = "Dev@2001";
	Response res = new Response();

	@Override
	public Response insertUser(Task1Model input) {

		String uuid = UUID.randomUUID().toString();
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		input.setUpdatedDate(date);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try (Connection con = DriverManager.getConnection(url, username, password);
					Statement st = con.createStatement();) {

//				System.out.println(input.getEmail());

				if (input.getEmail().contains("@gmail.com")) {

					if (String.valueOf(input.getPhoneNo()).length() == 10) {
						String insertQuery = "INSERT INTO user_details(s_no,first_name,last_name,gender,email,password,phone_no,updated_date)"
								+ "VALUES('" + uuid + "','" + input.getFirstName() + "','" + input.getLastName() + "','"
								+ input.getGender() + "','" + input.getEmail() + "','" + input.getPassword() + "',"
								+ input.getPhoneNo() + ",'" + input.getUpdatedDate() + "');";
						System.out.println(insertQuery);
						st.executeUpdate(insertQuery);
						res.setResponseCode(200);
						res.setResponseMsg("Success");
						res.setdata("");
					}

					else {
						res.setdata("check your mobile number");
					}
				} else {
					res.setdata("check the email");
				}

			} catch (Exception e) {
				e.printStackTrace();
				res.setResponseCode(500);
				res.setResponseMsg("error");
				res.setdata(input.getEmail());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;

	}

	@Override
	public Response validateUser(String email, String password1) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String insertQuery = "select*from user_details where email='" + email + "'and password='" + password1
					+ "';";
			try (Connection con = DriverManager.getConnection(url, username, password);
					PreparedStatement st = con.prepareStatement(insertQuery);) {
				ResultSet rset = st.executeQuery();
				System.out.println(rset);

				if (rset.next()) {
					res.setResponseCode(200);
					res.setResponseMsg("Success");
					res.setdata("Existing User");

				} else {
					res.setResponseCode(200);
					res.setResponseMsg("Success");
					res.setdata("invalid User Create an account");
				}
			}

			catch (Exception e) {
				e.printStackTrace();

				res.setResponseCode(500);
				res.setResponseMsg("error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

}
