package com.home.nanda.board.model.dto;

import lombok.Data;

@Data
public class Comment {
    private String articleId;
    private String commentId;
    private String content;
    private String userId;
    private String createdDate;
    private String updatedDate;
}
