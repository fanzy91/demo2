package net.xdclass.demo2.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.xdclass.demo2.domain.User;

@RestController
public class SampleController {
	
	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "Hello World!";
	}
	
	@RequestMapping("/test")
	public Map<String,String> test(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "zhangsan");
		return map;
	}
	
	@GetMapping("/testJson")
	public Object testJson(){
		return new User("12","123456","1111",new Date());
	}
	
}
