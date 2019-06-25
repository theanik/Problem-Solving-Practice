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
public class InsertionSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfelement,i;
        
        System.out.println("Enter The numver of elemnt  ");
        numberOfelement = input.nextInt();
        int data[] = new int[numberOfelement];
        System.out.println("Enter "+numberOfelement+" integer Number");
        for(i=0;i<numberOfelement;i++){
            data[i] = input.nextInt();
        }
        InsertionSort obj = new InsertionSort();
        obj.insertion_sort_function(data);
        obj.printDataarray(data);
    }
   
    void insertion_sort_function(int data[]){
        int i,j,item,tmp;
        for(i=1;i<data.length;i++){
            item = data[i];
            j=i-1;
            while(j>=0 && data[j] > item){
               
                data[j+1]=data[j];
             
                j=j-1;
            }
            data[j+1] = item;
        }
    }
    void printDataarray(int data[]){
        System.out.println("Sorted dara are...");
        int i;
        for(i=0;i<data.length;i++){
            System.out.println(""+data[i]);
        }
    }
}
