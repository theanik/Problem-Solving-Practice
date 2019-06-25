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
class Teacher{
    String techerName = "Anik anwar";
    String desigation = "Senior Instructor";
    void ShowDetails(){
        System.out.println("The teacher Name is "+this.techerName+"and his Desigtion is "+this.desigation);
        //return null;
    }
}

class TeacherInstitute extends Teacher{
    String instituteName = "BUET";
    void ShowInstitute(){
        System.out.println("This Techer teach at "+this.instituteName);
    }

}
class TeachSub extends TeacherInstitute{
    String subName = "Advance Programing";
    void showSub(){
        System.out.println("He teach "+this.subName);
    }
}

class TeacherInfo extends TeachSub{
    void showinfo(){
        System.out.println("This teacher all info are here...");
    }
}

public class inharitance extends TeacherInfo{
    public static void main(String[] args){
         inharitance objName = new inharitance();
         objName.showinfo();
         objName.ShowDetails();
         objName.ShowInstitute();
         objName.showSub();
    }
}
