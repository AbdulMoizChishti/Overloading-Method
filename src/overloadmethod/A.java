/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadmethod;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class A {
    
    
    //default method
    void data(){
        System.out.println("M1");
    }
    
    
     void data(int age){
    System.out.println("M2 g"+age);
    }
    void data(int age, String name){
    System.out.println("M3");
    }
    void data( String name,int age){
    System.out.println("M4");
    }
    
    
    
    
}
