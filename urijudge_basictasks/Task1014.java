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
public class Task1014 {
    
    public void calc() {
        
        Locale.setDefault(Locale.US);
        
        Scanner entry = new Scanner(System.in);

        int km =  entry.nextInt();

        double l = entry.nextDouble();

        System.out.println(String.format("%.3f km/l", km/l));
            
    }
    
}
