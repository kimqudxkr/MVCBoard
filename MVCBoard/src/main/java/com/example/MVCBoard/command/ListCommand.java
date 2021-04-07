package com.example.MVCBoard.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.example.MVCBoard.dao.BoardDao;
import com.example.MVCBoard.dto.BoardDto;

public class ListCommand implements Command {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		BoardDao dao = new BoardDao();
		ArrayList<BoardDto> dtos = dao.list();
		
		model.addAttribute("list",dtos);
	}

}
