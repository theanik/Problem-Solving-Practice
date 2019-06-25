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
public class bainarySeach {
    public static void main(String[] args){
        int nOe,seachValue,ub,lb,i,mid;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Number of Element = ");
        nOe = input.nextInt();
        int[] data = new int[nOe];
        System.out.println("Enter "+nOe+" Sorted integer number");
        for(i=0;i<data.length;i++){
            data[i] = input.nextInt();
        }
        System.out.println("Enter your search Element  ");
        lb = 0;
        ub = nOe -1;
        mid = (ub+lb)/2;
        seachValue = input.nextInt();
        while(lb<=ub){
            if(data[mid] < seachValue){
                lb = mid+1;
            }else if(data[mid]==seachValue){
                System.out.println(""+seachValue+" is present in location "+ (mid+1));
                break;
            }else if(data[mid] > seachValue){
            } else {
                ub = mid-1;
            }
        }
        if(lb>ub){
            System.out.println(seachValue + " is not present in list");
        }
    }
}