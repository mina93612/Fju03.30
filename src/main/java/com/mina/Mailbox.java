package com.mina;

import java.util.Scanner;

public class Mailbox {
    public static void main(String[] args) {
        Boxsize size = new Boxsize();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object\'s length: ");
        int length = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s width: ");
        int width = Integer.parseInt(scanner.next());

    }
}
