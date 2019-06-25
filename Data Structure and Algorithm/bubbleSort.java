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
public class bubbleSort {
 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfelement,i;
        System.out.println("Enter the number of Element");
        numberOfelement = input.nextInt();
        System.out.println("Enter "+numberOfelement+" integer number");
        int data[] = new int[numberOfelement];
        for(i=0;i<numberOfelement;i++){
            data[i] = input.nextInt();
        }
        
        //crear obj for call method
        bubbleSort cls_obj = new bubbleSort();
        cls_obj.BubbleSort(data, numberOfelement);
        System.out.println("Sorted data are....");
        cls_obj.PrintSortedArray(data);
    }
    void BubbleSort(int data[],int numberOfelemet){
        int i,j,tmp;
        for(i=0;i<data.length;i++){
            for(j=0;j<data.length - i -1;j++){
                if(data[j] > data[j+1]){
                    tmp = data[j];
                    data[j]=data[j+1];
                    data[j+1]=tmp;
                }
            }
        }
    }
    
    void PrintSortedArray(int data[]){
        int i;
        for(i=0;i<data.length;i++){
            System.out.println(""+data[i]);
        }
    }
}
