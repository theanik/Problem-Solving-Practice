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
public class palindrome {
     public static void main(String args[]){
//   String original, reverse = ""; // Objects of String class
//      Scanner in = new Scanner(System.in);
//     
//      System.out.println("Enter a string to check if it is a palindrome");
//      original = in.nextLine();
//     
//      int length = original.length();
//     
//      for (int i = length - 1; i >= 0; i--)
//         reverse = reverse + original.charAt(i);
//         
//      if (original != reverse)
//         System.out.println("The string is a palindrome.");
//      else
//         System.out.println("The string isn't a palindrome.");
//    

   Scanner input = new Scanner(System.in);
         String string = "madam";
         int i;
         String revarse = "";
         for(i=string.length() - 1;i>=0;i--){
            revarse = revarse + string.charAt(i);
         }
         System.out.println(""+revarse);
         System.out.println(""+string);
         if(string.equals(revarse)){
             System.out.println("palindrom");
         }else{
             System.out.println("not palindrom");
         }

    }
}

