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
public class selectionSort {
    public static void main(String[] args){
       int i,j,min_index,numberOfelement,tmp=0;
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element ");
        numberOfelement = input.nextInt();
        int data[] = new int[numberOfelement];
        for(i=0;i<numberOfelement;i++){
            data[i] = input.nextInt();
        }
        
        for(i=0;i<data.length -1;i++){
            min_index = i;
            for(j=i+1;j<data.length;j++){
                if(data[j] < data[min_index]){
                    min_index = j;
                }
            }
            if(i != min_index){
                tmp = data[i];
                data[i] = data[min_index];
                data[min_index] = tmp;
            }
            
        }
        System.out.println("Sorted data are......");
        for(i=0;i<data.length;i++){
            System.out.println(""+data[i]);
        }
    }
}
