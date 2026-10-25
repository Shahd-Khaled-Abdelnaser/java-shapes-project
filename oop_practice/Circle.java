/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_practice;


public class Circle extends Shape{
    private double radius ;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius ;
    }

    @Override
    public double getPerimeter() {
       return Math.PI * 2 * this.radius ;
    }

    @Override
    public String howToDraw() {
        return "Draw a circle with radius " + this.radius ;
    }
    
}
