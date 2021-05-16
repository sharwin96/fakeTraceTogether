package com.controller;

import com.entity.NewsAlertEntity;

public class NewsAlertController {

    String username;
    NewsAlertEntity newsAlertEntity;

    public NewsAlertController(String username) {
        this.username = username;
        newsAlertEntity = new NewsAlertEntity(username);
    }

    public String getNews() {
        return newsAlertEntity.getNews(username);

    }

    public String getAppointment() {
        return newsAlertEntity.getAppointment(username);
    }

}
