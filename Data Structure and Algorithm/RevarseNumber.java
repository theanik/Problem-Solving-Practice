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
public class RevarseNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your element");
        int element, revarse = 0,remainder;
        element = input.nextInt();
        while(element>0){
           remainder = element % 10;
           revarse = revarse * 10 + remainder;
           element = element / 10;
        }
        System.out.println(""+revarse);

    }
}
