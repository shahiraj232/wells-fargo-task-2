package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private Float purchasePrice;

    @Column(nullable = false)
    private Double quantity;

    protected Security(){

    }
    public Security(Portfolio portfolio, String name, String category, Date purchaseDate, Float purchasePrice, Double quantity){
        this.portfolio = portfolio;
        this.name = name;
        this.category= category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity= quantity;
    }

    public long getSecurityId(){
        return securityId;
    }
    public Portfolio getPortfolio(){
        return portfolio;
    }
    public void setPortfolio(Portfolio portfolio){
        this.portfolio= portfolio;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category= category;
    }
    public Date getPurchaseDate(){
        return purchaseDate;
    }
    public void setPurchaseDate(Date purchaseDate){
        this.purchaseDate= purchaseDate;
    }
    public Float getPurchasePrice(){
        return purchasePrice;
    }
    public void setPurchasePrice(Float purchasePrice){
        this.purchasePrice = purchasePrice;
    }
    public Double getQuantity(){
        return quantity;
    }
    public void setQuantity(Double quantity){
        this.quantity= quantity;
    }



}
