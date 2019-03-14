package net.xdclass.demo2.domain;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

@RestControllerAdvice
public class CustomExtHandler {
	
	private static final Logger LOG = LoggerFactory.getLogger(CustomExtHandler.class);
	
	@ExceptionHandler(value=Exception.class)
	Object handlerException(Exception e, HttpServletRequest request){
		Map<String,Object> map = new HashMap<>();
		return map;
	}
	
	@ExceptionHandler(value=MyException.class)
	Object handlerMyException(Exception e){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error.html");
		mv.addObject("msg", e.getMessage());
		return mv;
	}
	
}
