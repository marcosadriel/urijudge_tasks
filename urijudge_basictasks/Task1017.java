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
public class Task1017 {
    
    public void calc() {
        
        final int cons = 12; //Consumo do veículo
        
        Scanner entry = new Scanner(System.in);
        
        double tempo = (double) entry.nextInt();
        
        double media = (double) entry.nextInt();
        
        System.out.println(String.format(Locale.US, "%.3f", (tempo*media)/cons));
        
    }
    
}
