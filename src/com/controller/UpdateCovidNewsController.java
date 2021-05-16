package com.controller;

import com.entity.UpdateCovidNewsEntity;

public class UpdateCovidNewsController {

    String news;
    UpdateCovidNewsEntity updateCovidNewsEntity;

    public UpdateCovidNewsController() {
        updateCovidNewsEntity = new UpdateCovidNewsEntity();
    }

    public UpdateCovidNewsController(String news) {
        this.news = news;
    }

    public void updateNewsInEntity(String news) {
        updateCovidNewsEntity.updateNews(news);
    }
}
