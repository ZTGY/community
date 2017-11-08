package com.lanou.bean;

public class Weixin {
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }
}