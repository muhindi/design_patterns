/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */
package journaldev.creational.builder;

import java.util.Date;

/**
 *
 * @project: DesignPatterns
 * @author kelly
 * @date Jul 6, 2017 10:25:36 PM
 *
 *
 */
public class Article {

    //required parameters
    private String title;
    private String author;
    private Date publishedOn;

    //optional parameters
    private String category;
    private String keywords;

    //private constructor
    private Article(ArticleBuilder builder) {
        this.author = builder.author;
        this.title = builder.title;
        this.publishedOn = builder.publishedOn;
        this.category = builder.category;
        this.keywords = builder.keywords;

    }

    //not setter methods...just getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(Date publishedOn) {
        this.publishedOn = publishedOn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "Article{" + "title=" + title + ", author=" + author + ", "
                + "publishedOn=" + publishedOn + ", category=" + category + ","
                + " keywords=" + keywords + '}';
    }

    
    //inner static class
    public static class ArticleBuilder {

        //required parameters
        private String title;
        private String author;
        private Date publishedOn;

        //optional params
        private String category;
        private String keywords;

        public ArticleBuilder(String title, String author, Date publishedOn) {
            this.title = title;
            this.author = author;
            this.publishedOn = publishedOn;
        }

        public ArticleBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public ArticleBuilder setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }

        public Article build() {
            return new Article(this);
        }
    }

}
