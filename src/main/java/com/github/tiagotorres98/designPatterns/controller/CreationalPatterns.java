package com.github.tiagotorres98.designPatterns.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/creational")
public abstract class CreationalPatterns extends Controller{
	
	public abstract String getCreational();
	
}
