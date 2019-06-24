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
public class vajok {
    public static void main(String[] args) {
        int t;
        int n,i,j;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        for(i = 0;i<=t;i++){
            n = input.nextInt();
            if(n>1 && n<10000){
                System.out.print("Case "+i+":");
                for(j=1;j<=n;j++){
                    if(n%j == 0)
                        System.out.print(" "+j);
                }
            }else{
                return;
            }
            System.out.println("");
        }
        
    }
}
