package com.webexample.boardproject.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private long id;
    private Article article;
    private String content;

    private LocalDateTime regDt;
    private String regId;
    private LocalDateTime auditDt;
    private String auditId;
}
