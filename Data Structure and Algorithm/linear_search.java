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
public class linear_search {
    public static void main(String[] args){
        int seach_value,number_of_element;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element = ");
        number_of_element = input.nextInt();
        int[] data = new int[number_of_element];
        int i;
        System.out.println("Enter " + number_of_element +" Integer");
        for(i=0;i<number_of_element;i++){
            data[i] = input.nextInt();
        }
        System.out.println("Enter your seach value ");
        seach_value = input.nextInt();
        for(i=0;i<data.length;i++){
            if(data[i]==seach_value){
                System.out.println(""+seach_value+" present in location "+(i+1));
                break;
            }
        }
        if(i == number_of_element){
            System.out.println(""+seach_value+" is not presnt in this list");
        }
        
    }
}
