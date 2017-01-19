package com.zeze.peruconduce.model;

/**
 * Created by Bryam Soto on 18/01/2017.
 */

public class Title {

    private int titleId;
    private int ruleId;
    private String name;
    private int imgId;

    public Title(int titleId, int ruleId, String name, int imgId) {
        this.titleId = titleId;
        this.ruleId = ruleId;
        this.name = name;
        this.imgId = imgId;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public int getRuleId() {
        return ruleId;
    }

    public void setRuleId(int ruleId) {
        this.ruleId = ruleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
