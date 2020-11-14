package com.company;

import java.util.SplittableRandom;

public class Main {
    public static int task1(String str) {
        int ans = 0;
        int max = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                ans++;
            else if(max < ans) {
                max = ans;
                ans = 0;
            }

        }

        return ans;
    }

    public static int task2(int num) {
        int ans = num;
        while (ans > 9 ) {
            int t = 0;
            while(ans > 0) {
                t += ans%10;
                ans /= 10;
            }
            ans = t;
        }

        return ans;
    }

    public static strictfp String task3(int seconds) {
        if(seconds > 359999)
            return "ERROR";

        String time = null;
        int hh = 0, mm = 0, ss = seconds;

        hh = ss/60/60;
        mm = (ss/60 - hh*60);
        ss = ss - hh*60*60 - mm*60;

        time = hh + ":" + mm + ":" + ss;

        return time;
    }

    public static boolean hasNONELetters(String str) {
        char[] blacklist = new char[]{'l'};

        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < blacklist.length; j++) {
                if(str.charAt(i) == blacklist[j] || str.charAt(i) == blacklist[j] - 32)
                    return false;
            }
        }

        return true;
    }

    public static int[] findMultiples(int n, int num) {
        int[] multiples = new int[n];

        for(int i = 0; i < n; i++) {
            multiples[i] = num*(i+1);
        }

        return multiples;
    }

    public static String reverse(String str) {
        String rev = new String();
        int i = 0;
        int j = str.length() - 1;

        while (i < str.length()) {
          if(str.charAt(i) == ' ') {
               rev += ' ';
               i++;
           }
           else {
               if(str.charAt(j) == ' ')
                   j--;
               else {
                   rev += str.charAt(j);
                   j--;
                   i++;
               }
           }
        }

        return rev;
    }

    public static void main(String[] args) {
       int t1 = task1("asd, asipfpsajp, qwqe, sads, uodaf    asdjassg,123812 os");
       int t2 = task2(1245345);
       String t3 = task3(359999);
       boolean t4 = hasNONELetters("ewfe3fderwfwrgqfdfsafL");
       int[] t5 = findMultiples(3, 4);
       String t6 = reverse("Don't worry, be happy!");
    }
}
