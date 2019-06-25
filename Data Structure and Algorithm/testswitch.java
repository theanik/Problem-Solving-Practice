/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;
/**
 *
 * @author Anik Anwar
 */
public class testswitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char grad = 'C';
        //grad = input.next();
        switch(grad){
            case 'A':
                System.out.println("well done");
                break;
            case 'B':
            case 'C':
                System.out.println("Excellent");
                break;
            case 'D':
                System.out.println("you passed");
                break;
            case 'F':
                System.out.println("Batter try again");
                break;
            default:
                System.out.println("Invalid grad");
                
        }
    }
}
