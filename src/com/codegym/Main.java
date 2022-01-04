package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Chuyển đổi tiền tệ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập USD muốn chuyển đổi: ");
        int usd = scanner.nextInt();
        int vnd = usd * 23000;
        System.out.println(usd +" (USD) "+ " = "+vnd+" (VND)");
    }
}
