package com.zeze.peruconduce.model;

/**
 * Created by Bryam Soto on 18/01/2017.
 */

public class Article {
    private int articleId;
    private int titleId;
    private String name;
    private String detail;
    private String penalty;
    private String points;
    private String severity;

    public Article(int articleId, int titleId, String name, String detail, String penalty, String points, String severity) {
        this.articleId = articleId;
        this.titleId = titleId;
        this.name = name;
        this.detail = detail;
        this.penalty = penalty;
        this.points = points;
        this.severity = severity;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
