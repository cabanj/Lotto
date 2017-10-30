package com.cabanj.lotto;

import java.io.IOException;
import java.util.Scanner;

public class Printer {
    public static void main(String[] args) throws IOException {
        System.out.print("Please insert the number of iterations and press enter: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Generator g = new Generator();
        g.print(num);
    }
}
