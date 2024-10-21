package com.my.articles.api.controller;

import com.my.articles.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentAPI {
    private final CommentService commentService;

    public CommentAPI(CommentService commentService) {
        this.commentService = commentService;
    }

    //1. 댓글 조회
    @GetMapping("/api/comments/{commentId}")
    public ResponseEntity<?> commentSearch() {
        return null;
    }

    //2. 댓글 생성
    @PostMapping("/api/articles/{articleId}/comments")
    public ResponseEntity<?> commentCreate() {
        return null;
    }

    //3. 댓글 수정
    @PatchMapping("/api/comments/{commentId}")
    public ResponseEntity<?> commentUpdate() {
        return null;
    }

    //4. 댓글 삭제
    @DeleteMapping("/api/comments/{commentId}")
    public ResponseEntity<?> commentDelete() {
        return null;
    }
}
