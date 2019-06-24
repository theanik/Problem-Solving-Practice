/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg52.problem;
import java.util.*;
/**
 *
 * @author Anik Anwar
 */
public class countNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       String input;//= "23 54 343 55  56    7";
       input = in.nextLine();
       int endIndex = 0;
       int total = 0;
        int numIn = 0;
        //System.out.println(""+input.length());
       for(int beginIndex = 0;beginIndex<input.length();beginIndex = endIndex + 1){
           endIndex = input.indexOf(" ", beginIndex);
           //System.out.println(""+endIndex);
           //break;
           if(endIndex == -1){
               endIndex = input.length();
           }
           //System.out.println(""+endIndex);           
           //System.out.println(""+beginIndex);
           //break;
           String totalString = input.substring(beginIndex,endIndex);
           
           try{
               numIn = Integer.parseInt(totalString);
               total++;
           }catch(java.lang.NumberFormatException nfe){
               
           }

       }
        System.out.println(""+total);

//    String st = "a jdfjka";
//    System.out.println(""+st.indexOf(" ",3));
    }
}
