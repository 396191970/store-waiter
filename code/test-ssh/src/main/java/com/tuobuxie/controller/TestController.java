package com.tuobuxie.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 *
 * @author lishaofeng@szslcpay.com
 *
 */
@Controller
public class TestController
{

	//	@Value("#{configProperties['channelOrderUrl']}")
	//	public String channelOrderUrl;


	@RequestMapping(value = "/test1/{pay}", method = RequestMethod.GET)
	//	@Authority(value = 0, validate = BrowserValidator.class)
	public String test1(@PathVariable String pay)
	{


		return "error.h5";

	}


	@RequestMapping(value = "/test2")
	@ResponseBody
	public String test2()
	{
		Map<String, String> map = new HashMap<String, String>();
		System.out.println("test2");


		return "123123123";

	}
	@RequestMapping(value = "/test3")
	public String test3()
	{

		System.out.println("1231232");
		return "hello";

	}

}
