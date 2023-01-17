/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author walla
 */
public class Studentlist {
    public static void main(String[] args) {
        
        //Student s1 = new Student("s1", "Wallace");
        Student [] studentlist = new Student[3];
        studentlist [0] = new Student("s1", "Wallace");
        studentlist [1] = new Student("s2", "Tom");
        studentlist [2] = new Student("s3", "John");
        
        
        for(int i=0;i<studentlist.length;i++){
            System.out.println(studentlist[i].getStudentName());
        }
    }
    }

