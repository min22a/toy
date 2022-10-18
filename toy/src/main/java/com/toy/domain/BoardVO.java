package com.toy.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import lombok.Data;

@Data
@Validated 
public class BoardVO {
	
	
	private Long no; // 번호
	
	@NotNull
	private String username; // 작성자
	
	@NotNull
	private String title; // 제목
	
	private String content; // 내용
	
	private Date regist_date; // 등록일
	
	private Date last_date; // 업데이트일
	
	private Date bgnde; // 게시 시작
	
	private Date endde; // 게시 종료일
	
	private Long viewcnt; // 조회수
	
	private String noticeat; // 공지글 여부
	
	private String secretat; // 비밀글 여부
	
	
}
