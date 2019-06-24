/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg52.problem;

/**
 *
 * @author Anik Anwar
 */
public class vouleCountP17 {
    public static void main(String[] args) {
        String str = "Hello world";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
            
        }
        System.out.println(""+count);
    }
}
