package com.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.register.model.Register;
import com.register.repository.RegisterRepo;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterRepo repo;
	
	@RequestMapping("/reg")
	public String formPage() {
		return "register";
	}
	
	@RequestMapping("/submit-form")
	public String saveReg(Register register ) {
		
		 Register s=  repo.save(register);
		
		 if(s!=null) {
			 
			 return "success";
			 
		 }else {
			 
			 return "unsuccess";
		 } 
	}
	
}
