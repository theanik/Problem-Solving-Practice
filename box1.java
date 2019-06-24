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
public class box1 {
    public static void main(String[] args) {
        int t,n;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        for(int i = 1;i<=t;i++){
            n = input.nextInt();
            if(n>1 && n<=10){
                System.out.println("Case : "+i);
                for(int j = 1;j<=n;j++){
                    for(int k =1;k<=n;k++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }else{
                return;
            }
            
            
        }
    }
}
