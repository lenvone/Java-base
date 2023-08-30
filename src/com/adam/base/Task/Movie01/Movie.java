package com.adam.base.Task.Movie01;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/18
 */
public class Movie {
    private String name;
    private Double price;
    private String director;
    private Integer date;

    public Movie(String name,Double price,String director,Integer date){
        this.name = name;
        this.price = price;
        this.director = director;
        this.date = date;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public String info() {
        return "电影名称：" + name  + "\t 导演：" + director + " \t  上映日期：" + date + "\t 票价：" + price;
    }
    @Override
    public String toString(){
        return "电影名称："+name+"\t电影价格："+price+"\t电影导演："+director+"\t上映时间："+date;
    }
}
