package com.company;

import java.util.Scanner;

public class IO {

    public static class In {
        public static int numInt()
        {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            return num;
        }
    }

    public static class Out {
        public static void text(String text)
        {
            System.out.printf("%s", text);
        }

        public static void num(int num)
        {
            System.out.printf("%d", num);
        }

        public static void array(int[] arr, int start, int lenght, int step)
        {
            for(int i = start; i < lenght; i+=step)
            {
                    System.out.printf("%d ", arr[i]);
            }
        }
    }

}
