package com.trungnguyen.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trungnguyen.model.Person;

@Controller
@RequestMapping("/admin")
public class HelloController {
	@Autowired
	private Person person;
	@RequestMapping("/hello")
	public String sayHello(ModelMap mm) {
		mm.addAttribute("person",person);
		return "hello";
	}
	@RequestMapping(value= {"/sayHello","/talkHello"})
	public ModelAndView talkHello(HttpServletRequest request) {
		request.setAttribute("person", person);
		return new ModelAndView("hello");
	}
}
