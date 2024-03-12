package Session03;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaiTap7 {
    public static void main(String[] args) {
        // Bài 7: Nhập số phần tử của mảng (n),
        // khai báo và nhập giá trị các phần tử của mảng 1 chiều số nguyên.
        // Nhập giá trị (addValue) và chỉ số chèn phần tử vào mảng (addIndex),
        //thực hiện thêm chèn giá trị addValue và chỉ số addIndex của mảng

        // nhập vào số phần tử của mảng
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tủ của mảng > ");
        int n = Integer.parseInt(sc.nextLine());

        // khai báo mảng 1 chiều số nguyên
        int[] array = new int[n];

        // nhập giá trị các phần tử mảng 1 chiều
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị mảng vị trí %d > ", i);
            array[i] = Integer.parseInt(sc.nextLine());
        }

        // nhập giá trị và vị trí cần chèn
        System.out.print("Nhập giá trị cần chèn > ");
        int addValue = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập vị trí cần chèn > ");
        int addIndex = Integer.parseInt(sc.nextLine());

        //thêm chèn

        int[] newArray;
        if (addIndex > array.length) {
            newArray = Arrays.copyOf(array, n+1);
            newArray[array.length] = addValue;
        } else {
            newArray = new int[n+1];
            int index = 0;
            for (int i = 0; index < newArray.length; i++) {

                if (index == addIndex) {
                    newArray[index] = addValue;
                    i--;
                } else {
                    newArray[index] = array[i];
                }


                index++;
            }
        }

        // mảng mới
        System.out.println(Arrays.toString(newArray));






    }
}
