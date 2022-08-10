package com.example.demo.entity;


import javax.persistence.*;

@Entity
public class StockWrapper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long stock_ID;
    private String company_name;
    private Integer number_stocks;
    private double open_price;
    private double close_price;

    public StockWrapper() {
    }

    public long getStock_ID() {
        return stock_ID;
    }

    public void setStock_ID(Integer stock_ID) {
        this.stock_ID = stock_ID;
    }

    public String getcompany_name() {
        return company_name;
    }

    public void setcompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Integer getNumber_stocks() {
        return number_stocks;
    }

    public void setNumber_stocks(Integer number_stocks) {
        this.number_stocks = number_stocks;
    }

    public double getOpen_price() {
        return open_price;
    }

    public void setOpen_price(double open_price) {
        this.open_price = open_price;
    }

    public double getClose_price() {
        return close_price;
    }

    public void setClose_price(double close_price) {
        this.close_price = close_price;
    }
}

