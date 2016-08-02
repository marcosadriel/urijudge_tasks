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
public class Task1008 {

    public void calc() throws IOException {
        int funcId, funcHours;
        double funcRemToHours, funcSal;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        funcId = Integer.parseInt(in.readLine());
        funcHours = Integer.parseInt(in.readLine());
        funcRemToHours = Double.parseDouble(in.readLine());
        funcSal = funcHours * funcRemToHours;
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", funcId, funcSal);
    }

}
