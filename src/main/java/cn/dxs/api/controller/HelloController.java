package cn.dxs.api.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public Object hello() {
		return "hello springboot";
	}

	@RequestMapping("/hello2")
	public Object hello2(String code) {
		return "hello springboot2 " + code;
	}

	@RequestMapping(value = "/hello3", method = RequestMethod.POST)
	public Object hello3(@RequestBody JSONObject jObj, HttpServletRequest request) {
		return "hello springboot3 " + jObj;
	}

}
