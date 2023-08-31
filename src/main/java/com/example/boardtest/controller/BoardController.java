package com.example.boardtest.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.boardtest.dto.BoardDTO;
import com.example.boardtest.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/board/")
public class BoardController {

    ////////////////////////////////////////////////////
    private final BoardService boardService;

    ////////////////////////////////////////////////////
    @GetMapping("list")
    public void list(Model model) {

        List<BoardDTO> list = boardService.boardList();

        model.addAttribute("list", list);

        log.info("GET | LIST!!!!!");
    }
    
}
