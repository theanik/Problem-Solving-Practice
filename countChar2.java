/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg52.problem;

import java.util.Scanner;

/**
 * problem 15
 * @author Anik Anwar
 */
public class countChar2 {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
       String sentence = "hello world";

        // Create an array of size 256 ASCII_SIZE
        int count[] = new int[256];
        int length = sentence.length();

        // Initialize count array index
        for (int i = 0; i < length; i++)
            count[sentence.charAt(i)]++;

        // Create an array of given String size
        char chars[] = new char[sentence.length()];
        for (int i = 0; i < length; i++) {
            chars[i] = sentence.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found
                if (sentence.charAt(i) == chars[j])
                    find++;
            }

            if (find == 1) {
               System.out.println("Occurrence of " + sentence.charAt(i) + " is:" + count[sentence.charAt(i)]);

            }
        }
        
    }
}
