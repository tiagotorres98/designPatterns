package com.github.tiagotorres98.designPatterns.controller;

public class Controller {

	protected static final String BREAK_LINE = "<br>";
	protected static final String DOUBLE_BREAK_LINE = "<br><br>";
	
	protected String link(String link, String text) {
		return String.format("<a href=\"%s\">%s</a>", link,text);
	}
}
