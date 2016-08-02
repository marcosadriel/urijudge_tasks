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
public class Task1007 {

    public void calc() throws IOException {
        int a, b, c, d, diferenca;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());
        c = Integer.parseInt(in.readLine());
        d = Integer.parseInt(in.readLine());
        diferenca = (a * b - c * d);
        System.out.printf("DIFERENCA = %d%n", diferenca);
    }

}
