/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        Drawable [] circles = new Drawable[10];
        Drawable [] cubes = new Drawable[10];
        double totalArea = 0 ;
        for(int i = 0 ; i < 10 ; i++)
        {
         double r = input.nextDouble();
         circles[i] = new Circle(r) ;
         totalArea += ((Circle)circles[i]).getArea();
        }
        for(int j = 0 ; j < 10 ; j++)
        {
         double r = input.nextDouble();
         cubes[j] = new Cube(r) ;
         totalArea += ((Cube)cubes[j]).getArea();
        }
        System.out.println(totalArea);
        
    
        
    }
    
}
