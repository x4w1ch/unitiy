package com.company;

import java.util.Scanner;

public class Main {
    public static strictfp void Task1(String str) {
        if(str.matches("^[a-zA-Z]+$")) {
            System.out.print("ERROR");
            return;
        }

        str += "\n";

        double ans = 0;
        double t = 0;
        int funI = 0;

        for(int i = 0; i < str.length(); i++) {
            if((int)str.charAt(i)-48 >= 0 && (int)str.charAt(i)-48 <= 9) {
                t = t * 10 + ((int)str.charAt(i)-48);
            }
            else {
                if(ans != 0 && t != 0){
                    switch (str.charAt(funI)) {
                        case '+': {
                            ans += t;
                            t = 0;
                            funI = i;
                            break;
                        }
                        case '-': {
                            ans -= t;
                            t = 0;
                            funI = i;
                            break;
                        }
                        case '*': {
                            ans *= t;
                            t = 0;
                            funI = i;
                            break;
                        }
                        case '/': {
                            ans /= t;
                            t = 0;
                            funI = i;
                            break;
                        }
                    }
                }
                else {
                    ans = t;
                    t = 0;
                    funI = i;
                }
            }
        }

        System.out.print(ans);
    }

    public static void Task2(int n) {
      int arr[] = new int[n];
      int n2 = Math.round(n/2);
      int k = 0;

      if(n%2 == 0)
          k = 1;

      for(int i = 0; i < n2; i++) {
          arr[n2 - i - k] = i;
          arr[n2 + i] = i;
      }

      for(int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
      }

      System.out.print("\n");
      return;
    }

    public static  void Task3() {
        Scanner in = new Scanner(System.in);
        String entstr = null;
        String str = "";
        int c = 0;

        while(true) {
            System.out.print("1: Enter a new value\n2: Show all entered values\n3: Exit\n");
            c = in.nextInt();
            int ind = 0;

            switch(c) {
                case 1: {
                    System.out.print("Enter a new valuse:\n");
                    entstr = in.next();
                    if(entstr.charAt(0) == '+') {
                        if(str == "")
                            str += entstr.substring(1);
                        else
                            str += ", " + entstr.substring(1);
                        entstr = null;
                    }
                    else if(entstr.charAt(0) == '-') {
                        if(str.indexOf(entstr.substring(1)) == 0)
                            str = str.substring(entstr.length() + 1);
                        else
                            str = str.substring(0, str.indexOf(entstr.substring(1)) - 2) + str.substring(str.indexOf(entstr.substring(1)) - 1 + entstr.length());
                        entstr = null;
                    }
                    else {
                        System.out.print("ERROR\n");
                    }
                    break;
                }
                case 2: {
                    System.out.print(str + "\n");
                    break;
                }
                case 3: {
                    return;
                }
            }

        }
    }

    public static void main(String[] args) {
        Task3();
        Task2(14);
	    Task1("100+10*2/5*113/12*8973");
    }
}
