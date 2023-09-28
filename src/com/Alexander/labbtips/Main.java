package com.Alexander.labbtips;

public class Main {
    public static void main(String[] args) {


        try {
            System.out.println("dwadwa");
            System.out.println(2/0);
        } catch (Exception e) {
            System.out.println("inne");
            e.printStackTrace();
        }

    }
}