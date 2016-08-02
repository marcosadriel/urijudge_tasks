/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urijudge_basictasks;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author marcos.rost
 */
public class Task1006 {
    
    public void calc() throws IOException {
        double A, B, C, MEDIA;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());
        C = Double.parseDouble(in.readLine());
        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);
        System.out.printf("MEDIA = %.1f%n", MEDIA);         
    }
    
}
