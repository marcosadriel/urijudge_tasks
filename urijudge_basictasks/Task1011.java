/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urijudge_basictasks;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author marcos.rost
 */
public class Task1011 {
    
    //final private double pi = 3.14159;
    
    public void Task1011() {
        
    }
    
    public void calc() {
        
        double pi = 3.14159;
        
        Locale.setDefault(Locale.US);
        
        Scanner entry = new Scanner(System.in);
        
        double R = entry.nextDouble();
        
        double vol = (4.0/3.0) * pi * (Math.pow(R, 3));
        
        System.out.println(String.format("VOLUME = %.3f", vol));
        
        
        
    }
    
}
