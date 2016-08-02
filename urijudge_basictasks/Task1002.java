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
public class Task1002 {
    
    public void calc() throws IOException{
        double area, raio;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        raio = Double.parseDouble(in.readLine());
        area = 3.14159 * (raio * raio);
        System.out.printf("A=%.4f%n", area);
    }
    
}
