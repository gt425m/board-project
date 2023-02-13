package com.webexample.boardproject.domain;

import java.time.LocalDateTime;

public class Article {
    private long id;
    private String title;
    private String content;
    private String hashtag;

    private LocalDateTime regDt;
    private String regId;
    private LocalDateTime auditDt;
    private String auditId;
}
