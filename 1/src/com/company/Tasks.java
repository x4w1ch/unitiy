package com.company;

public class Tasks {

    public static class Task_1
    {
        private int rows;
        private int columns;

        public void enteringData()
        {
            IO.Out.text("Enter the number of rows: ");
            rows = IO.In.numInt();

            IO.Out.text("Enter the number of columns: ");
            columns = IO.In.numInt();
        }

        private int[][] creatTwoDimArray()
        {
            enteringData();
            int[][] arr = new int[rows][columns];
            return arr;
        }

        private void randomFillArray(int[][] arr)
        {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = (int)(Math.random() * 9);
                }
            }
        }

        private void showArr(int[][] arr)
        {
            IO.Out.text("Your array: \n");
            for(int i = 0; i < rows; i++)
            {
                IO.Out.array(arr[i], 0, columns, 1);
                IO.Out.text("\n");
            }
        }

        private void secondDiagonal(int[][] arr)
        {
            System.out.printf("\nYour secondary diagonal: \n");
            for (int i = 0; i < rows; i++) {
                if((arr[i][columns-i - 1] % 2) == 0) {
                    IO.Out.num(arr[i][columns - i - 1]);
                    IO.Out.text(" ");
                }
            }
            IO.Out.text("\n");
        }

        public void answer()
        {
            IO.Out.text("\nExercise 1\n");
            int[][] excArr = creatTwoDimArray();
            randomFillArray(excArr);
            showArr(excArr);
            secondDiagonal(excArr);
        }

    }

    public static class Task_2
    {
        private int begin;
        private int end;
        private int step;
        private int size;

        public void enteringData()
        {
            IO.Out.text("Begin: ");
            begin = IO.In.numInt();

            IO.Out.text("Ent: ");
            end = IO.In.numInt();

            IO.Out.text("Step: ");
            step = IO.In.numInt();
        }

        private strictfp int[] fillArray(int begin, int end, int step)
        {
            if(begin >= end || step > (end - begin)) return null;

            size = end/step - begin/step;

            if(begin%step == 0)
                size+=1;

            int[] arr = new int [size];

            for(int i = 0; i < size; i++){
                arr[i] = begin + step * i;
            }

            return arr;
        }

        public void answer()
        {
            IO.Out.text("\nExercise 2\n");
            enteringData();
            int[] arr = fillArray((int)begin, (int)end, (int)step);
            IO.Out.array(arr, 0, size, 1);
        }

    }
}
