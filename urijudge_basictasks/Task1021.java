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
public class Task1021 {
    
    public void calc() {
        
        Locale.setDefault(Locale.US);
        
        Scanner entry = new Scanner(System.in);
        
        double valor = entry.nextDouble();
        
        double resto = valor; 
                        
        int [] cedulas;
        cedulas = new int[6];
        
        int [] moedas;
        moedas = new int[6];
        
        int [] c = {100, 50, 20, 10, 5, 2};
        
        double [] m = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
                
        int i = 0;
                
        while (i <= 5) { 
            if (resto % c[i] != 0) {
                cedulas[i] = (int) resto/c[i];
                resto -= (double) cedulas[i] * c[i];
            } else {
                cedulas[i] = (int) resto/c[i];
                resto = 0;
                break;
            }
            i++;
        }
        
        if (resto > 0) {
            
            i = 0;
            
            double coin = 0;
            
            while (i <= 5) { 
                if (resto % m[i] != 0) {
                    coin = resto/m[i];
                    moedas[i] = (int) coin;
                    resto -=  moedas[i] * m[i];
                } else {
                    coin = resto/m[i];
                    moedas[i] = (int) coin;
                    resto = 0;
                    break;
                }
                i++;
            }
        }
        
        i = 0;

        System.out.println("NOTAS:");
        
        while (i <= 5) {
            System.out.println(String.format(
                    "%d nota(s) de R$ %d.00", cedulas[i], c[i]));
            i++;
        }
        
        i = 0;
        
        System.out.println("MOEDAS:");
        
        while (i <= 5) {
            System.out.println(String.format(
                    "%d moeda(s) de R$ %.2f", moedas[i], m[i]));
            i++;
        }
    }
    
}
