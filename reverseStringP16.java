/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg52.problem;
//problem 16

import java.util.Scanner;

/**
 *
 * @author Anik Anwar
 */
public class reverseStringP16 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String str;       
        //String str = "This is a test";
        str = input.nextLine();
        
        String[] separeteWordArr = str.split(" "); //["this","is","a","test"]
        String revStr = "";
        String word ="";
        for (int i = 0; i < separeteWordArr.length; i++) { // This
            String revWord = "";
            word = separeteWordArr[i]; // word = This
            for (int j = word.length() - 1; j >= 0; j--) { // j:3 = s,j:2=i,j:1=h,j:0 = T
                revWord = revWord + word.charAt(j); // revWord = s i h T
            }
           revStr = revStr + revWord + " ";
        }
        System.out.println(""+revStr);
    }
}
