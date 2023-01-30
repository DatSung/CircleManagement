/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.*;
/**
 *
 * @author uinic
 */
public class Circle {
//    ATTRIBUTES
    private double x;
    private double y;
    private double r;


//SETTER AND GETTER


    public void setX(double x) {
        if (x > 0)
        this.x = x;
    }

    public void setY(double y) {
        if (y > 0)
        this.y = y;
    }

    public void setR(double r) {
        if (r > 0)
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public void outputCircle() {
        System.out.printf("|%4.1f|%4.1f|%4.1f|\n", x, y, r);
    }
//CONSTRUCTOR
    public Circle() {
        x = 0;
        y = 0;
        r = 0;
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void inputCircle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input x: ");
        x = input.nextDouble();
        System.out.println("Input y: ");
        y = input.nextDouble();
        System.out.println("Input r: ");
        r = input.nextDouble();
    }

    public double getDistance(double x2, double y2) {
        return Math.sqrt( (x-x2)*(x-x2) + (y-y2)*(y-y2) );
    }
}
