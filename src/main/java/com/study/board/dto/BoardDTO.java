package com.study.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {
    //save와 이름 일치해야됨
    private Long id; //글번호
    private String boardWriter; //작성자
    private String boardPass; //비밀번호
    private String boardTitle; //제목
    private String boardContents; //내용
    private int boardHits; //조회수
    private String createdAt; //작성시간


}
