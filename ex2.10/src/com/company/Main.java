package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 0x3;
        int j = 0x10;
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("j = " + Integer.toBinaryString(j));
        System.out.println("i >> j - " + Integer.toBinaryString(i >> j));
        System.out.println("i << j - " + Integer.toBinaryString(i << j));
        System.out.println("i & j = " + Integer.toBinaryString(i & j));
        System.out.println("i | j = " + Integer.toBinaryString(i | j));
        System.out.println("i ^ j = " + Integer.toBinaryString(i ^ j));
        System.out.println("~i = " + Integer.toBinaryString(~i));
        System.out.println("~j = " + Integer.toBinaryString(~j));
    }
}