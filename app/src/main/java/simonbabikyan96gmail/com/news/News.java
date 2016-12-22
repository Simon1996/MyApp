package simonbabikyan96gmail.com.news;

/**
 * Created by Admin on 22.12.2016.
 */

public class News {
    private String title;
    private String article;
    private String imageUrl;

    public News(String title, String article, String imageUrl) {
        this.title = title;
        this.article = article;
        this.imageUrl = imageUrl;
    }

    public News(){

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
