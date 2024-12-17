package com.example.portfolio.service;

import com.example.portfolio.repository.NewsRepository;
import jakarta.transaction.Transactional;

@Transactional
public class NewsService {
    private NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }


}
