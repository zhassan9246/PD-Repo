/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stallion
 */
import java.util.Scanner;

public class Driver {
    public static int wordCounter(String s){
        
 int count=1;
       
         
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
            count++;
        }
        }
        return count;
    }
   public static int vowelcounter(String s){
       int count =0;
       
       for(int i=0;i<s.length();i++){
           if((s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')||(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')){
           count++;
       }
       }
       return count;
   }
   public static int puncCount(String s){
       int count =0;
       
       for(int i=0;i<s.length();i++){
           if((s.charAt(i)=='.'|| s.charAt(i)==':' || s.charAt(i)==';'|| s.charAt(i)=='-'|| s.charAt(i)=='!')||(s.charAt(i)==','||s.charAt(i)=='?'||s.charAt(i)=='"'||s.charAt(i)=='#'||s.charAt(i)=='@')){
           count++;
       }
       }
       return count;
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the String:");
        String s=sc.nextLine();
        int a=wordCounter(s);
        System.out.println("Number of Words:"+a);
        int b=vowelcounter(s);
        System.out.println("Number of Vowels:"+b);
        
        int c=puncCount(s);
        System.out.println("Number of Punctuations:"+c);
        
     }
    
}
