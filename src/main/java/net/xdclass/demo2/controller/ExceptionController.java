package net.xdclass.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.xdclass.demo2.domain.MyException;

@RestController
public class ExceptionController {
	
	@GetMapping("/v1/testExt")
	public void testExt(){
		throw new MyException("404", "访问路径找不到！");
	}
	
}
