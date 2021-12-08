/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author shiza
 */
public class Validator<T> implements Userinterface<T> {
    int index=0;
   protected T[] element;
   int find=0;
   int i=0;
   int c=0;
   public  Validator(){
       element=(T[]) new Object[100];   }
   public boolean Add(T elements){
    
     element[index]=elements;
     index++;
     return true;
     
}

public int size(){
    return index;
} public static void main(String[] args) {
        Userinterface<String> test;
            test = new Validator<String>();
test.Add("Umer"); test.Add("123");

test.Add("Shazia");test.Add("123");

test.Add("Anamika");test.Add("Anamika");

test.Add("Emran");test.Add("Emran");

       
    }
}