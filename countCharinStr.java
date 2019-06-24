/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg52.problem;

import java.util.Scanner;
//problem-14
/**
 *
 * @author Anik Anwar
 */
public class countCharinStr {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        String inuptString;
        char findL;
        System.out.println("Enter your String");
        inuptString = in.nextLine();
        System.out.println("Enter which char you want to count");
        findL = in.next().charAt(0);
        int count = 0;
        for(int i = 0;i<inuptString.length();i++){
             if(inuptString.charAt(i) == findL){
                 count++;
             }      
        }
        
        if(count <= 0){
            System.out.println("" +findL+ " is not present");
        }else{
        System.out.println(""+count);
        }
        
    }
}
