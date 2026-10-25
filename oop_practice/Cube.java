/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_practice;


public class Cube extends ThreeDShape {
    private double side ;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Cube(double side) {
        this.side = side;
    }

   public Cube(String c, double side) {
    super();
    this.side = side;
    }
    @Override
    public double getArea()
    {
     return 6 * this.side * this.side ;
    }

    @Override
    public double getVolume() {
      return this.side * this.side * this.side ;     
    }

    @Override
    public double getPerimeter() {
        return 12 * this.side ;
    }

    @Override
    public String howToDraw() {
        return "Draw a cube with side " + this.side ;
    }

    @Override
    public String toString() {
        return "Cube{" + "side= " + side + "volume= " + this.getVolume() +'}';
    }
    
}
