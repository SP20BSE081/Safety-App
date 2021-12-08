/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Domain;

/**
 *
 * @author shiza
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Userinterface<String> test;
            test = new Validator<String>();
test.Add("Umer"); test.Add("123");

test.Add("Shazia");test.Add("Shazia");

test.Add("Anamika");test.Add("Anamika");

test.Add("Emran");test.Add("Emran");

        System.out.println("Size  "+test.size());
    }}
