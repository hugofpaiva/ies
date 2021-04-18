package com.hugofpaiva.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	
    /** 
     * @param @RequestParam(name="name"
     * @param required=false
     * @param name
     * @param model
     * @return String
     *  Accept HTTP GET requests and when provided the name parameter, it uses it to render a template page
     */
    @GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

}