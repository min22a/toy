package com.toy.mapper;

import java.util.List;

import com.toy.domain.BoardVO;

public interface BoardMapper {
		
	public List<BoardVO> selectAll();
	
	public BoardVO selectOne(Long no);
	
	public void insert(BoardVO vo);
	
	public void delete(Long no);
	
	public void update(Long no);
	
	public void viewcnt(Long no); //조회수 증가
}
