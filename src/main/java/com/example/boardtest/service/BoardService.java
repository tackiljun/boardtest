package com.example.boardtest.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.example.boardtest.dto.BoardDTO;


@Transactional
public interface BoardService {
    
    List<BoardDTO> boardList();

    BoardDTO boardOne(Long bno);
    
}
