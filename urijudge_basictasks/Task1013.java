/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urijudge_basictasks;

import java.util.Scanner;

/**
 *
 * @author marcos.rost
 */
public class Task1013 {
    
    public void calc() {
        
        Scanner entry = new Scanner(System.in);
        
        int a = entry.nextInt();
        
        int b = entry.nextInt();
        
        int c = entry.nextInt();
        
        int maior = (a + b + Math.abs(a - b))/2;
        
        maior = (c + maior + Math.abs(c - maior))/2;
        
        System.out.println(String.format("%d eh o maior", maior));
    }
    
}
