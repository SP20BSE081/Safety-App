/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Domain;
import java.util.*;
/**
 *
 * @author shiza
 */
public class Localdatabase {
int i=0;
 private static  ArrayList<String>Usernam= new ArrayList<>();  
private static  ArrayList<String> password= new ArrayList<>();  
    public  boolean AddDetails(String Username,String pass){
        
   Usernam.add(Username);
      password.add(pass);
         return true; 
}
public String nam(int i){
  
    Usernam.indexOf(i);
    return Usernam.get(i);
}}
