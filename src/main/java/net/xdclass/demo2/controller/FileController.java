package net.xdclass.demo2.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@PropertySource({"classpath:application.properties"})
public class FileController {
	
	private Map<String,Object> params = new HashMap<String,Object>();
	
	@Value("${web.file.path}")
	private String FILE_PATH = "";
	
	@RequestMapping("/page/goPage")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/upload")
	@ResponseBody
	public Object upload(MultipartFile file){
		String filename = file.getOriginalFilename();
		String prefix = filename.substring(0, filename.lastIndexOf("."));
		String suffix = filename.substring(filename.lastIndexOf("."));
		String allname = prefix + UUID.randomUUID() + suffix;
		File dir = new File(FILE_PATH + allname);
		try {
			file.transferTo(dir);
			params.put("allname", allname);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return params;
	}
}
