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
public class factLsb0count {
    public static void main(String[] args) {
        int t;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
         for(int i = 0;i<t;i++){
            long fact;
            fact = 1;
            
            int n = input.nextInt();
            
            for(int j = 2;j<=n;j++){
                fact = fact*j;
            }
            //ystem.out.println(""+fact);
            int mod,zc;
            zc = 0;
            while(fact>0){
                mod = (int) (fact%10);
                if(mod==0)
                    zc++;
                else
                    break;
                
                fact = fact/10;
            }
             System.out.println(""+zc);
            
        }
    }
}
