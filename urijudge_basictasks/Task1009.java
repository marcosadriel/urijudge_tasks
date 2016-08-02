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
public class Task1009 {

    public void calc() throws IOException {
        String funcName;
        double funcVendas, funcSalFixo;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        funcName = in.readLine();
        funcSalFixo = Double.parseDouble(in.readLine());
        funcVendas = Double.parseDouble(in.readLine());
        System.out.printf("TOTAL = R$ %.2f%n", (funcSalFixo + funcVendas * 0.15));
    }

}