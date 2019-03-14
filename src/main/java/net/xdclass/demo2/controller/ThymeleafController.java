package net.xdclass.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import net.xdclass.demo2.domain.ServerSetting;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
	
	@Autowired
	private ServerSetting setting;
	
	@RequestMapping("/hello")
	public String index(ModelMap modelMap){
		modelMap.addAttribute("setting", setting);
		return "tl/index";
	}
}
