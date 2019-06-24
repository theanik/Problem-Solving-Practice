/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg52.problem;

/**
 *
 * @author Anik Anwar
 */
public class vouleConP18 {
    public static void main(String[] args) {
        String str = "this is very easy";
        String strArrr[] = str.split(" ");
        String fstr = "";
        for (int i = 0; i < strArrr.length; i++) {
            fstr = fstr + strArrr[i];
        }
        //System.out.println(""+fstr);
        String vLetter = "";
        String cLetter = "";
        for (int i = 0; i < fstr.length(); i++) {
            boolean con = fstr.charAt(i) == 'a' ||  fstr.charAt(i) == 'e' ||  fstr.charAt(i) == 'i' ||  fstr.charAt(i) == 'o' ||
                     fstr.charAt(i) == 'u';
            if(con){
                vLetter = vLetter + fstr.charAt(i);
            }else{
                cLetter = cLetter + fstr.charAt(i);
            }
        }
        System.out.println(""+vLetter);
        System.out.println(""+cLetter);
        
        
            // methid 2
//            String v = "";
//            String c = "";
//            for (int i = 0; i < str.length(); i++) {
//                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
//                    v = v + str.charAt(i);
//                }else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
//                    c = c + str.charAt(i);
//                }
//            }
//            System.out.println(""+v);
//            System.out.println(""+c);
    }
}
