package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("請輸入一數值：");
        int input=scanner.nextInt();
        System.out.print(input+" 以下的質數有：\n");

        for(int i=2;i<=input;i++)

        {

            boolean isPrime=true;

            for(int j=2;j<i;j++)

            {

                if(i%j==0)

                {

                    isPrime=false;

                    break;

                }

            }

            if(isPrime)

            {

                System.out.print(i+"  ");

            }

        }

    }

}
