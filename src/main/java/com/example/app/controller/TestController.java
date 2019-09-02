package com.example.app.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/testGet")
	public String testGet() throws UnknownHostException {
		String result = "Test Get";
		
		String ip = InetAddress.getLocalHost().getHostAddress();
		String port = "";
		
		
		result = "Test Get : Hello Docker Server Running is " + "IP : " + ip + " Port : " + port;
		
		System.out.println("##### " + result);
		
		return result;
	}
	
	@PostMapping("/testPost")
	public String testPost() throws UnknownHostException {
		String result = "Test Get";
		
		String ip = InetAddress.getLocalHost().getHostAddress();
		String port = "";
		
		result = "Test Get : Hello Docker Server Running is " + "IP : " + ip + " Port : " + port;
		
		System.out.println("##### " + result);
		
		return result;
	}

}
