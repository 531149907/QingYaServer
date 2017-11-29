package p.hin.qingya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import p.hin.qingya.entity.Article;
import p.hin.qingya.service.ArticleService;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/article")
public class ArticleController {
    @Autowired
    ArticleService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Article getArticle(@PathVariable("id") int id) {
        return service.getArticleById(id);
    }


    @RequestMapping(method = RequestMethod.GET)
    List<Article> getArticles(@RequestParam(required = false) int type,
                              @RequestParam(required = false) String keyword) {
        if (keyword != null) {
            return service.searchArticlesByKeyword(keyword);
        }
        return service.getArticlesByType(type);
    }

}
