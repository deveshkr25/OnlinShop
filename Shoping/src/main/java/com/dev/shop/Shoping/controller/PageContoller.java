package com.dev.shop.Shoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageContoller {

	@RequestMapping(value ={"/","/home","/index"})
	public ModelAndView index(){
		
		ModelAndView mv=new ModelAndView("page");
		
		mv.addObject("msg" ,"Welcome Spring MVC");
		return mv;
		
	}
	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="msg",required=false) String msg){
		
		if(msg == null){
		   msg="hello test";	
		}
		ModelAndView mv=new ModelAndView("page");
		
		mv.addObject("msg" ,msg);
		return mv;
		
	}
}
