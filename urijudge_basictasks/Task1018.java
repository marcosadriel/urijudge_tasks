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
public class Task1018 {
    public void calc() {
        
        Scanner entry = new Scanner(System.in);
        
        int valor = entry.nextInt();
        
        int resto = valor; 
                        
        int [] cedulas;
        cedulas = new int[7];
        
        int [] c = {100, 50, 20, 10, 5, 2, 1};
                
        int i = 0;
                
        while (i <= 6) { 
            if (resto % c[i] != 0) {
                cedulas[i] = resto/c[i];
                resto -= cedulas[i] * c[i];
            } else {
                cedulas[i] = resto/c[i];
                break;
            }
            i++;
        }
        
        i= 0;

        System.out.println(valor);
        
        while (i <= 6) {
            System.out.println(String.format(
                    "%d nota(s) de R$ %d,00", cedulas[i], c[i]));
            i++;
        }
    }
}
