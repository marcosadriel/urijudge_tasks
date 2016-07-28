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
public class Task1012 {
    
    public void calc() {
        
        double pi = 3.14159;
        
        Locale.setDefault(Locale.US);
        
        Scanner entry =  new Scanner(System.in);
        
        double a = entry.nextDouble();
        
        double b = entry.nextDouble();
        
        double c = entry.nextDouble();
        
        System.out.println(String.format("TRIANGULO: %.3f", (a * c)/2));
        
        System.out.println(String.format("CIRCULO: %.3f", Math.pow(c, 2) * pi));
        
        System.out.println(String.format("TRAPEZIO: %.3f", ((a + b) * c)/2));
        
        System.out.println(String.format("QUADRADO: %.3f", Math.pow(b, 2)));
        
        System.out.println(String.format("RETANGULO: %.3f", a * b));
        
    }
    
}
