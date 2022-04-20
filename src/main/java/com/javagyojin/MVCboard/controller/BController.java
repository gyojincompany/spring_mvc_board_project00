package com.javagyojin.MVCboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javagyojin.MVCboard.command.BCommand;
import com.javagyojin.MVCboard.command.BListCommand;

@Controller
public class BController {
	
	BCommand command = null;
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		command = new BListCommand();
		command.excute(model);
		
		return "list";
	}
	
	@RequestMapping(value = "/write_view")
	public String write_view() {
		
		return "write_view";
	}
	
	@RequestMapping(value = "/content_view")
	public String content_view() {
		
		return "content_view";
	}
	
	@RequestMapping(value = "/reply_view")
	public String reply_view() {
		
		return "reply_view";
	}
	
	@RequestMapping(value = "/write")
	public String write() {
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/modify")
	public String modify() {
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/delete")
	public String delete() {
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/reply")
	public String reply() {
		
		return "redirect:list";
	}
}
