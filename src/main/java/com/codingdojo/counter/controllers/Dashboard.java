package com.codingdojo.counter.controllers;

import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Dashboard {
	public static int count =0;
	
	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		count++;
		session.setAttribute("count", count);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		int count = (Integer) session.getAttribute("count");
		model.addAttribute("count", count);
		return "count.jsp";
	}
	@RequestMapping("/count_two")
	public String countTwo(HttpSession session) {
		count=count+2;
		session.setAttribute("count", count);
		return "twoCount.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		count = 0;
		session.setAttribute("count", count);
		return "count.jsp";
	}
}
