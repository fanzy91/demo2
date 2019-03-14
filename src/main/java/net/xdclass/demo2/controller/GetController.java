package net.xdclass.demo2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.xdclass.demo2.domain.User;

@RestController
public class GetController {
	
	private Map<String,Object> params = new HashMap<String,Object>();
	
	/**
	 * 功能描述：测试restful协议，从路径中获取字段
	 * @param cityId
	 * @param userId
	 * @return
	 */
//	@RequestMapping(path = "/{city_id}/{user_id}", method = RequestMethod.GET)
//	public Object findUser(@PathVariable("city_id") String cityId, @PathVariable("user_id") String userId){
//		params.clear();
//		params.put("cityId", cityId);
//		params.put("userId", userId);
//		return params;
//	}
	
	/**
	 * 功能描述：测试GetMapping
	 * @param form
	 * @param size
	 * @return
	 */
	@GetMapping("/v1/page_user")
	public Object pageUser(int form, int size){
		params.clear();
		params.put("form", form);
		params.put("size", size);
		return params;
	}
	
	/**
	 * 功能描述：测试是否必须参数
	 * @param form
	 * @param size
	 * @return
	 */
	@GetMapping("/v1/page_user2")
	public Object pageUser2(@RequestParam(defaultValue = "0", name = "page") int form, int size){
		params.clear();
		params.put("form", form);
		params.put("size", size);
		return params;
	}
	
	/**
	 * 功能描述：测试bean对象传参
	 * @param user
	 * @return
	 */
	@RequestMapping("/v1/save_user")
	public Object saveUser(@RequestBody User user){
		params.clear();
		params.put("user", user);
		return params;
	}
	
	/**
	 * 功能描述：测试从header获取头信息
	 * @param accessToken
	 * @param id
	 * @return
	 */
	@RequestMapping("/v1/get_header")
	public Object getHeader(@RequestHeader("access_token") String accessToken, String id){
		params.clear();
		params.put("accessToken", accessToken);
		params.put("id", id);
		return params;
	}
	
	@GetMapping("/v1/mockMvc")
	public String mockMvcTest(){
		return "mockMvc";
	}
}
