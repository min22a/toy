package com.toy.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.domain.BoardVO;
import com.toy.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{
	

	private BoardMapper mapper;

	@Override
	public Map<String, Object> selectListAll() {
		
		List<BoardVO> list = null;
		
		list = mapper.selectAll();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("boardlist", list);
		
		return map;
	}

	@Override
	public void register(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Long no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Long no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardVO selectOne(Long no) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
