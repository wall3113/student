/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import java.util.Scanner;

/* @author wallace*/
public class ReserveWord {
    
        public static void main(String[] args) {
            char[] myArray = new char[7];
            myArray[0] = 's';
            myArray[1] = 't';
            myArray[2] = 'u';
            myArray[3] = 'd';
            myArray[4] = 'e';
            myArray[5] = 'n';
            myArray[6] = 't';
            
             for(int i=0;i<myArray.length;i++){
                 System.out.println(myArray[i]);}
                 
              System.out.println("Enter word");
              Scanner sc = new Scanner(System.in);
              String word = sc.nextLine();
              
              char[] myLetter = new char[word.length()];
              for(int j=0;j<myLetter.length;j++){
              myLetter[j]= word.charAt(j);
              System.out.println(myLetter[j]);}
              
              System.out.println("Printing in reverse");
              for(int j=myLetter.length-1;j>=0;j--){
              myLetter[j]= word.charAt(j);
              System.out.println(myLetter[j]);}
              
             }
            
        }
    

