package com.left.im.bean;

import cn.bmob.v3.BmobObject;

public class DailyArticle extends BmobObject {

    private String essay; // 文章内容

    public String getEssay() {
        return essay;
    }

    public void setEssay(String essay) {
        this.essay = essay;
    }

}
