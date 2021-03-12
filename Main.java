package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int maxvalue=0;
        int minvalue=0;
        int ref;
        System.out.println("Enter number");
        //for(int i=0;i<6;i++)
        while (true)
        {
            boolean check=scanner.hasNextInt();

            if (check) {
                ref=scanner.nextInt();
                scanner.nextLine();
                if (minvalue > ref) {
                    minvalue = ref;
                }
                if (maxvalue < ref) {
                    maxvalue = ref;
                }

            }
            else
                break;

        }
        System.out.println("max is "+ maxvalue+" min is "+minvalue);
        scanner.close();
    }
}
