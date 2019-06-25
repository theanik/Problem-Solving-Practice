/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.lang.reflect.Constructor;

/**
 *
 * @author Anik Anwar
 */
public class Constroctor {
    public Constroctor(){
        System.out.println("THis a constructor method..that's call automatacally when creat a clss obj");
    }
    public Constroctor(int a){
        System.out.println("thats copy constrocture number "+a);
    }
    public static void main(String[] args){
        Constroctor obj = new Constroctor();
       // obj.Constroctor(1);
        Constroctor obj1 = new Constroctor(1);
    }
}
