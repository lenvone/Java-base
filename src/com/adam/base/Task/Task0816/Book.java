package com.adam.base.Task.Task0816;

public class Book {

    private String title;

    private String author;

    private Integer year;

    private Double price;

    public Book(){}

    public Book(String title, String author, Integer year, Double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String info(){
        return year + "年出版的 " + author + " 的 《" + title + "》, 售价" + price;
    }

    @Override
    public String toString(){
        return info();
    }
}
