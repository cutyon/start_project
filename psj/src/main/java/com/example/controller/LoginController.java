package com.example.controller;

import org.apache.ibatis.binding.MapperMethod.ParamMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/gets")
	public void gets(Model model) {
		System.out.println("login controller gets");
		ParamMap paramMap = new ParamMap();
		model.addAttribute("list", loginService.getList(paramMap));
	}
}
