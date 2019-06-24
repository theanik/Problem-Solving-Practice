/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg52.problem;

import java.util.Scanner;

/**
 *     problem 13
 * @author Anik Anwar
 */
public class probability {
//    public static void main(String[] args) { 
//        int t,i,j,k;
//         Scanner input = new Scanner(System.in);
//         t = 2;
//         
//         for(j=1;j<=t;j++){
//            String inputStr;
//            inputStr = input.nextLine();
//            inputStr = inputStr.trim();
//            if(inputStr.length() != -1){
//               String words[];
//               int wc = 0;
//               words = inputStr.split(" ");
//               for(i=0;i<words.length;i++){
//                   wc++;
//               }
//                System.out.println(""+wc);
//                
//                int p = 1;
//               for(i=0;i<words.length;i++){
//                   for(k=i+1;k<words.length;k++){
//                       
//                   }
//               }
//                
//            }
//             
//         }
//    }

     public static void main(String[] args) {  
        String string1 = "Great responsibility";  
        int count;  
          
        //Converts given string into character array  
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
                System.out.println(""+count);
        }  
    }  
    
}
