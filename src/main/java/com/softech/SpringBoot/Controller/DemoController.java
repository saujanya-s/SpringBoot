package com.softech.SpringBoot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/demo") //page haru sanga request garne kaam, value le url dine
public class DemoController {
	
     @RequestMapping(value= "/all")
	 public String getAll(){
		return "home";
		}
}
