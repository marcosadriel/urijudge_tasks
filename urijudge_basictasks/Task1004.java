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
public class Task1004 {
    
    public void calc() throws IOException {
         int A, B, PROD;
         InputStreamReader ir = new InputStreamReader(System.in);
         BufferedReader in = new BufferedReader(ir);
         A = Integer.parseInt(in.readLine());
         B = Integer.parseInt(in.readLine());
         PROD = A * B;
         System.out.printf("PROD = %d%n", PROD);        
    }
    
}
