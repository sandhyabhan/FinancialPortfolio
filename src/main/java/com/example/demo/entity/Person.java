package com.example.demo.entity;

import javax.persistence.*;

@Entity

public class Person {

    @Id
    @GeneratedValue
    private Integer ID;
    private String Name;
    private Integer gold_bonds;
    @OneToOne(cascade = CascadeType.ALL)
    private StockWrapper stocks;

    @OneToOne(cascade = CascadeType.ALL)
    private DOI doi;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getGold_bonds() {
        return gold_bonds;
    }

    public void setGold_bonds(Integer gold_bonds) {
        this.gold_bonds = gold_bonds;
    }

    public DOI getDoi() {
        return doi;
    }

    public void setDoi(DOI doi) {
        this.doi = doi;
    }

    public StockWrapper getStocks() {
        return stocks;
   }

    public void setStocks(StockWrapper stocks) {
       this.stocks = stocks;
    }
}
