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
public class Task1016 {
    
    public void calc() {
        
        Scanner entry =  new Scanner(System.in);
        
        int dist = entry.nextInt();
        
        System.out.println(String.format(Locale.US, "%d minutos", dist * 2));
    }
    
}
