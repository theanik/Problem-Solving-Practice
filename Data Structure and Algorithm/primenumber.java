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
public class primenumber {
    public static void main(String[] args){
       
        for(int i=2;i<25;i++){
            for(int j = 2;j<=i;j++){
                if(i == j){
                   // result += i;
                   System.out.println(""+i );
                }else if(i%j==0){
                    break;
                }
            }
        }
       // System.out.println("Reult is " +result);
    }
    
}
