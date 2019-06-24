/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg52.problem;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Anik Anwar
 */
public class purnoborgo {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int t,i,n,sqr_root;
       t = input.nextInt();
       for(i=0;i<t;i++){
           n = input.nextInt();
           sqr_root = (int) Math.sqrt(n);
           
           
           if((sqr_root*sqr_root) == n){
               System.out.println("YES");
           }else
               System.out.println("NO");

//        if(Math.ceil(sqr_root) == Math.floor(sqr_root)){
//               System.out.println("Yes");
//        }
//        else{
//               System.out.println("NO");
//        }

           

       }
        
    }
}
