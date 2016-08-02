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
public class Task1019 {
    
    public void calc() {
        
        Scanner entry = new Scanner(System.in);
        
        int segundos = entry.nextInt();
        
        int [] tempo = {0, 0};
        
        tempo[0] = segundos/3600;
        
        segundos -= tempo[0] * 3600;
        
        tempo[1] = segundos/60;
        
        segundos -= tempo[1] * 60;
        
        System.out.println(String.format("%d:%d:%d", tempo[0], tempo[1], 
                segundos));
        
    }
    
}
