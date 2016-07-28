/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urijudge_basictasks;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author marcos.rost
 */
public class Task1010 {

    public void calc() {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Float c = sc.nextFloat();

        Float total = b * c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextFloat();
        total += b * c;
        
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
     
}

