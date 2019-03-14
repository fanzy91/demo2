package net.xdclass.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.xdclass.demo2.domain.ServerSetting;

@Controller
@RequestMapping("/freemarker")
public class FreemarkerController {
	
	@Autowired
	private ServerSetting setting;

	@GetMapping("/index")
	public String index(ModelMap modelMap){
		modelMap.addAttribute("setting", setting);
		return "fm/index";
	}
	
}
