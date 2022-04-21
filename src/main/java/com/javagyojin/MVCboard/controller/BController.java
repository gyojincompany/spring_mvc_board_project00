package com.javagyojin.MVCboard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javagyojin.MVCboard.command.*;

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
	public String write_view(Model model) {
		
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
	public String write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new BWriteCommand();
		command.excute(model);		
		
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
