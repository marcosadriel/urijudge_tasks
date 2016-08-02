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
public class Task1020 {
    
    public void calc() {
        
        Scanner entry = new Scanner(System.in);
        
        int dias = entry.nextInt();
        
        int [] idade = {0, 0};
        
        idade[0] = dias/365;
        
        dias -= idade[0] * 365;
        
        idade[1] = dias/30;
        
        dias -= idade[1] * 30;
        
        System.out.println(String.format("%d ano(s)", idade[0]));
        
        System.out.println(String.format("%d mes(es)", idade[1]));
        
        System.out.println(String.format("%d dia(s)", dias));
    }
    
}
