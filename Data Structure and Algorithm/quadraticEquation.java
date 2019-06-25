/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Anik Anwar
 */
public class quadraticEquation {
    public static void main(String[] args){
        double a,b,c,root1,root2,d;
        a = 3;
        b = 5;
        c = 2;
        d = Math.sqrt(b*b-4*a*c);
        root1 = (-b+d)/2*a;
        root2 = (-b-d)/2*a;
        
        System.out.println("Root 1 = "+root1+" and root 2 ="+root2);
        
    }
}
