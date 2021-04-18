package com.hugofpaiva.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealController {

	private static final String template = "The meal contains %s!";
	private final AtomicLong counter = new AtomicLong();

	
	/** 
	 * @param "ingredient"
	 * @param name
	 * @return Meal
	 *  Accept HTTP GET requests and when provided the parameter ingredient, it uses it to render a template page
	 */
	@GetMapping("/meal")
	public Meal meal(@RequestParam(value = "ingredient", defaultValue = "Hamburguer") String name) {
		return new Meal(counter.incrementAndGet(), String.format(template, name));
	}
}
