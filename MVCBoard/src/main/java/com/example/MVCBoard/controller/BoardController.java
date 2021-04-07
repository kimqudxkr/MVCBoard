package com.example.MVCBoard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.MVCBoard.command.Command;
import com.example.MVCBoard.command.ContentCommand;
import com.example.MVCBoard.command.DeleteCommand;
import com.example.MVCBoard.command.ListCommand;
import com.example.MVCBoard.command.ModifyCommand;
import com.example.MVCBoard.command.WriteCommand;

@Controller
public class BoardController {

	Command command;
	
	//리스트 목록을 띄우는 페이지
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		
		command = new ListCommand();
		command.execute(model);
		
		return "list";
	}
	
	//게시글 작성 페이지
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view");
		
		return "write_view";
	}
	
	//작성 페이지에서 작성 요청 시
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write()");
		
		model.addAttribute("request", request);
		
		command = new WriteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	//리스트에서 게시글 선택 시 내용 보는 페이지
	@RequestMapping("/content")
	public String content(HttpServletRequest request, Model model) {
		System.out.println("content()");
		
		model.addAttribute("request", request);
		
		command = new ContentCommand();
		command.execute(model);
		
		return "content";
	}
	
	//게시글 수정 페이지
	@RequestMapping(method = RequestMethod.POST, value = "/modify")
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("modify()");
		
		model.addAttribute("request", request);
		
		command = new ModifyCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	
	//게시글 삭제 요청 시
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete()");
		
		model.addAttribute("request", request);
		
		command = new DeleteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
}
