/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urijudge_basictasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author marcos.rost
 */
public class Task1001 {
    
    public void calc() throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
         
        int A, B, X;
         
        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());
         
        X = A + B;
         
        System.out.printf("X = %d\n", X);
    }
    
}
