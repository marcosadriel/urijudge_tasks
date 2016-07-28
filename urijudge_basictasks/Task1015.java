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
public class Task1015 {
    
    public void calc() {
        
        Locale.setDefault(Locale.US);
        
        Scanner entry =  new Scanner(System.in);
        
        double x1 = entry.nextDouble();
        
        double y1 = entry.nextDouble();
        
        double x2 = entry.nextDouble();
        
        double y2 = entry.nextDouble();
        
        double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        
        System.out.println(String.format("%.4f", dist));
        
    }
    
}
