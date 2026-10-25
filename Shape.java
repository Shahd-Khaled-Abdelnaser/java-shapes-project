/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package oop_practice;

import java.util.Date;

public abstract class Shape implements Drawable {
    private String color ;
    private Date dateCreated ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Shape() {
    this.dateCreated = new Date();
    }

    public Shape(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    
    
     public abstract String howToDraw();
     
    
}
