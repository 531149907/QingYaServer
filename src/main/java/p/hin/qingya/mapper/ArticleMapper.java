package p.hin.qingya.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import p.hin.qingya.entity.Article;

import java.util.List;

@Mapper
public interface ArticleMapper {

    @Select("select * from article")
    List<Article> getArticles();

    @Select("selcet * from article where id=#{0}")
    Article getArticle(int id);

    @Select("select * from article where title like #{0}")
    List<Article> getArticles(String keyword);

    @Select("select * from article where type=#{0}")
    List<Article> getArticles(int type);
}
