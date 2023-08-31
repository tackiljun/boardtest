package com.example.boardtest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.boardtest.dto.BoardDTO;
import com.example.boardtest.mappers.BoardMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    ///////////////////////////////////////////////////
    private final BoardMapper boardMapper;
    
    ///////////////////////////////////////////////////
    @Override
    public List<BoardDTO> boardList() {
        
        List<BoardDTO> list = boardMapper.boardList();

        log.info(list);

        return list;
    }

    ///////////////////////////////////////////////////
    @Override
    public BoardDTO boardOne(Long bno) {
        
        BoardDTO boardOne = boardMapper.boardOne(bno);

        return boardOne;
    }
    
}
