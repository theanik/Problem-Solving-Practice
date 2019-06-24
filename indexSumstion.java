/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg52.problem;

import java.util.Scanner;
/**
 *
 * @author Anik Anwar
 */
public class indexSumstion {
    public static void main(String[] args) {
        int n,t,sum;
         Scanner input = new Scanner(System.in);
         t = input.nextInt();
         while(t>0){
             n = input.nextInt();
             if(n >= 0 && n <= 65535){
                int lsb,msb;
                lsb = n%10;
                //System.out.println(""+lsb);

                while(n>=10){
                    n = n / 10;
                    //System.out.println(""+n);
                }
                msb = n;
                 //System.out.println(""+msb);
                 sum = lsb + msb;
                 System.out.println(""+sum);
             }else{
                 return;
             }
             
             t--;
         }
         
    }
}
