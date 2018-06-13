package com.dimaUKR;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int temp = fncFirst(2,8);
        System.out.println("Function result "+temp);
        fncFirst1(2,12);
        int[] iArray =  readArray();

        for (int i=0;i<iArray.length;i++){
            System.out.println("arr["+i+"]="+iArray[i]);
        }

    }

    public static int fncFirst(int a, int b){ // функція зводить до степеня чісло і повертає результат типу int А В дорівнює степені
        int result = 1;

        for (int i=0;i<b;i++)
        {
            result *=a;
        }
        return result;

    }

    public static void fncFirst1(int a, int b){ // функція зводить до степеня чісло і виводить на екран А В дорівнює степені
        int result = 1;

        for (int i=0;i<b;i++)
        {
            result *=a;
        }
        System.out.println("result= "+result);

    }

    public static int[] readArray(){
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
            System.out.print("Введіть кількість єлементі масиву:");
        n = in.nextInt();
        arr = new int[n];

        for (int i=0;i<n;i++){
            System.out.print("Введіть данні "+i+"-го елементу масива: ");
            arr[i] = in.nextInt();
        }

        return arr;
    }

}
