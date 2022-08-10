package com.neusoft.po;

import java.math.BigDecimal;
import java.util.Objects;

public class Food {
    private Integer foodid;

    private String foodname;

    private String foodexplain;

    private BigDecimal foodprice;

    private Integer bid;

    private String remarks;

    private String foodimg;

    public Integer getFoodid() {
        return foodid;
    }

    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFoodexplain() {
        return foodexplain;
    }

    public void setFoodexplain(String foodexplain) {
        this.foodexplain = foodexplain;
    }

    public BigDecimal getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(BigDecimal foodprice) {
        this.foodprice = foodprice;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFoodimg() {
        return foodimg;
    }

    public void setFoodimg(String foodimg) {
        this.foodimg = foodimg;
    }

    public Food() {
    }

    public Food(String foodname, String foodexplain, BigDecimal foodprice, Integer bid, String remarks, String foodimg) {
        this.foodname = foodname;
        this.foodexplain = foodexplain;
        this.foodprice = foodprice;
        this.bid = bid;
        this.remarks = remarks;
        this.foodimg = foodimg;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodid=" + foodid +
                ", foodname='" + foodname + '\'' +
                ", foodexplain='" + foodexplain + '\'' +
                ", foodprice=" + foodprice +
                ", bid=" + bid +
                ", remarks='" + remarks + '\'' +
                ", foodimg='" + foodimg + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        Food food = (Food) o;
        return Objects.equals(foodid, food.foodid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodid);
    }
}