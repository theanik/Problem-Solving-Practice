/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Anik Anwar
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("okkk");
        Scanner input = new Scanner(System.in);
        
//        double hight,base,area;
//        System.out.println("Enter the triangle hight");
//        hight = input.nextInt();
//        System.out.println("Enter the triangle base");
//        base = input.nextInt();area = 0.5*base*hight;
//        System.out.println("Area of triangle is "+area);

        //finonacci
        int n,t1=0,t2=1,next;
        n=input.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(""+t1);
            next = t1+t2;
            t1=t2;
            t2=next;
        }
        
    }
    
}
