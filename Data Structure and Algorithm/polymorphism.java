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
class ProgramingLanguage{
    float getRateOfinterest(){
        return 0;
    } 
}
class C extends ProgramingLanguage{
    float getRateOfinterest(){
        return 25.5f;
    }
}
class cpp extends ProgramingLanguage{
    float getRateOfinterest(){
        return 36.45f;
    }
}
class java extends ProgramingLanguage{
    float getRateOfinterest(){
        return 76.44f;
    }
}
class php extends ProgramingLanguage{
    float getRateOfinterest(){
        return 65.34f;
    }
}
public class polymorphism {
    public static void main(String[] args){
        ProgramingLanguage obj;
        obj = new C();
        System.out.println("the "+obj.getRateOfinterest()+" % pepole are intersted in C programing");
        obj = new cpp();
        System.out.println("the "+obj.getRateOfinterest()+" % people are intersted in c++ programin");
        obj = new java();
        System.out.println("the "+obj.getRateOfinterest()+" % people are intersted in JAVA programin");
        obj = new php();
         System.out.println("the "+obj.getRateOfinterest()+" % people are intersted in php programin");
        
    }
}
