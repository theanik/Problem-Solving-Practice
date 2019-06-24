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
public class sortin3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t,n1,n2,n3,tmp;
        t = input.nextInt();
        for(int i=1;i<=t;i++){
            n1 = input.nextInt(); //3           
            n2 = input.nextInt(); //7
            n3 = input.nextInt(); //5
            
            if(n1>n2){
                tmp = n1;
                n1=n2;
                n2=tmp;
                //System.out.println(""+n2);
            }
            if(n2>n3){
                tmp=n2;
                n2=n3;
                n3=tmp;
            }
            
            
            System.out.println("Case "+i+":"+n1+" "+n2+" "+ n3);
            

        }
    }
}
