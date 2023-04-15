package com.jack.tab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class controller_web {

	/* directly go to the chrome and use " http:localhost:<portno>/web  " */
	
	
	@RequestMapping("/web")
	public String mypage() {
		return "WEb page is live ";
	}
	
	@RequestMapping("/proj")
	public String login() {
		return "            Login page";
	}
	
}
