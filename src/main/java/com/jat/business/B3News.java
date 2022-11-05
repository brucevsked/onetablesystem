package com.jat.business;

import java.time.LocalDateTime;

public class B3News {

    private long id;
    private long typeId;
    private String title;
    private String auther;
    private LocalDateTime addDateTime;
    private long userId;
    private String content;

    public B3News(long id, long typeId, String title, String auther, LocalDateTime addDateTime, long userId, String content) {
        this.id = id;
        this.typeId = typeId;
        this.title = title;
        this.auther = auther;
        this.addDateTime = addDateTime;
        this.userId = userId;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public long getTypeId() {
        return typeId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuther() {
        return auther;
    }

    public LocalDateTime getAddDateTime() {
        return addDateTime;
    }

    public long getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", typeId=" + typeId +
                ", title='" + title + '\'' +
                ", auther='" + auther + '\'' +
                ", addDateTime=" + addDateTime +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                '}';
    }
}
