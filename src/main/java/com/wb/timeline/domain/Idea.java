package com.wb.timeline.domain;

import com.wb.timeline.dao.BaseEntity;

public class Idea extends BaseEntity{

    private static final long serialVersionUID = -1913311289110173588L;
    
    /**标题. */
    private String title;
    
    /**内容. */
    private String content;
    
    /**所属用户. */
    private User user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
