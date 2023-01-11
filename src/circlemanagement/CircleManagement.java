/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlemanagement;
import data.Circle;
/**
 *
 * @author uinic
 */
public class CircleManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circle cl1 = new Circle();
        cl1.inputCircle();
        cl1.outputCircle();

        Circle cl2= new Circle();
        cl2.inputCircle();
        cl2.outputCircle();

        System.out.println("Distance Cl1 with Cl2:" + cl1.getDistance(cl2.getX(), cl2.getY()));
        System.out.println("Distance Cl2 with Cl1:" + cl2.getDistance(cl1.getX(), cl1.getY()));
    }
    
}
