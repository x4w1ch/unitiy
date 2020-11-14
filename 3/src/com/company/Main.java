package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void SortOnlyC(List<String> list)
    {
        String found;
        int foundI;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).charAt(0) == 'c')
            {
                found = list.get(i);
                foundI=i;
                for(int j = i+1; j < list.size(); j++)
                {
                    if(list.get(j).charAt(0) == 'c')
                    {
                        if(Integer.parseInt(list.get(j).substring(1)) < Integer.parseInt(found.substring(1))) {
                            found = list.get(j);
                            foundI = j;
                        }
                    }
                }

                list.set(foundI, list.get(i));
                list.set(i, found);
            }
        }

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).charAt(0) == 'c')
                list.set(i, list.get(i).replace('c', 'C'));
        }
    }

    public static strictfp void Task2(int n) {
        int[] arr = new int[n];
        Random rand = new Random();

        float sum= 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = rand.nextInt(10);
            sum+=arr[i];
            System.out.print(arr[i] + " ");
        }
        sum/=n;
        System.out.print("\n" + sum);
        return;
    }

    public static String Task3(String smt)
    {
        for(int i = 0; i < smt.length(); i++)
        {
            if(smt.charAt(i) >= 'h' && smt.charAt(i) <= 't') {
                char gg = (char)(smt.charAt(i) - 32);
                smt = smt.substring(0, i) + gg + smt.substring(i+1);
            }
        }
        return smt;
    }

    public static void main(String[] args) {
	    List<String> myList = Arrays.asList("a1", "c89412896", "b1", "c1512", "c12190", "a1", "c5", "b1", "c0", "d1");
        Task2(10);

        String forTask3 = "jdhgfsjkavchjwagehf";
        forTask3 = Task3(forTask3);
        SortOnlyC(myList);
    }
}
