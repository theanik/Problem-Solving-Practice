/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg52.problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Anik Anwar
 */
public class test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String str = "this is very easy";
        String v = "";
        String c = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                v = v + str.charAt(i);
            }else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                c = c + str.charAt(i);
            }
        }
        System.out.println(""+v);
        System.out.println(""+c);
            
    }
}
