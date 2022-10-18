package com.toy.service;

import java.util.Map;

import com.toy.domain.BoardVO;

public interface BoardService {
	
	public Map<String, Object> selectListAll();
	
	public void register(BoardVO vo);
	
	public void remove(Long no);
	
	public void modify(Long no);
	
	public BoardVO selectOne(Long no);

}
