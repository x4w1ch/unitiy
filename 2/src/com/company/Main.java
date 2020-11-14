package com.company;

public class Main {

    public static void main(String[] args) {
        Lists.LinkedList<Integer> list = new Lists.LinkedList<Integer>();
        list.add(1); //0
        list.add(2); //1
        list.add(3); //2
        list.add(4); //3
        list.add(0); //4
        list.add(5); //5
        list.add(6); //6
        list.add(7); //7

        list.remove(4);
        System.out.print(list.contains(123213));

        String a = "Kak";
        Lists.SerializationUtil<String> ser = new Lists.SerializationUtil<>(a);

        ser.GetObjectFromFile("D://1.txt");
        String b = ser.GetOutData();
    }
}
