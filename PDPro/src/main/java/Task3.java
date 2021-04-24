
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stallion
 */
public class Task3 {
public static String ridMultipleBlank(String s){
    char[] chars=s.toCharArray();
        String j="";
        for(int i=0; i<chars.length;i++){
            if(chars[i]!=' '){
            j=j+chars[i];
        }
        }
       return j;
      
}
public static String removeInteger(String s){
    
    String q="";
    for(int i=0; i<s.length();i++){
       
        q=s.replaceAll("[0-9]", "");
        
    }
    return q;
}
public static String stringEncryption(String s){
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the String:");
        String s=sc.nextLine();
         String a= ridMultipleBlank(s);
       System.out.println(a);
       String b= removeInteger(s);
       System.out.println(b);
    
}
}