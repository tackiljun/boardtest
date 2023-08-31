package com.example.boardtest.mappers;

import java.util.List;

import com.example.boardtest.dto.BoardDTO;

public interface BoardMapper {

    List<BoardDTO> boardList();

    BoardDTO boardOne(Long bno);
    
}
