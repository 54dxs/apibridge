package cn.dxs.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;

import cn.dxs.api.pojo.R;

@RestController
@RequestMapping("bot")
public class BotController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public R post(@RequestBody JSONObject jObj) {
		if (null == jObj) {
			return R.error("请求参数错误");
		}
		System.out.println("data=" + jObj.toJSONString());
		
		String url = jObj.getString("url");
		JSONObject data = jObj.getJSONObject("data");
		
		JSONObject result = restTemplate.postForObject(url, data, JSONObject.class);
		
		System.out.println("result=" + JSONObject.toJSONString(result));
		
		return R.ok(result);
	}

}
