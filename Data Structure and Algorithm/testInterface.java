/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Anik Anwar
 */
interface in1{
    final int a = 1;
    void showdata1();
}
interface in2{
    final int b = 2;
    void showdata2();
}
public class testInterface implements in1,in2 {
    public void showdata1(){
        System.out.println("This is interface number "+a);
    }
    public void showdata2(){
        System.out.println("this is interface number "+b);
    }
    public static void main(String[] args){
        testInterface inObj = new testInterface();
        inObj.showdata1();
        inObj.showdata2();
        
    }
}
