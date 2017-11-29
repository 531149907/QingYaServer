package p.hin.qingya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.hin.qingya.entity.Article;
import p.hin.qingya.mapper.ArticleMapper;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    public List<Article> getArticlesByType(int type) {
        return articleMapper.getArticles(type);
    }

    public List<Article> searchArticlesByKeyword(String keyword) {
        return articleMapper.getArticles(keyword);
    }

    public Article getArticleById(int id) {
        return articleMapper.getArticle(id);
    }

}
