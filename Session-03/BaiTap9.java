package Session03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaiTap9 {
    public static void main(String[] args) {
        // Bài 9: Nhập số phần tử của mảng (n),
        // khai báo và nhập giá trị các phần tử của mảng 1 chiều số nguyên.
        // Nhập chỉ số phần tử cần xóa (deleteIndex)
        // thực hiện xóa phần tử trong mảng theo deleteIndex

        // nhập số phà tử mảng
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng > ");
        int n = Integer.parseInt(sc.nextLine());

        // khai báo mảng
        int[] array = new int[n];

        // nhập giá trị mảng
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị số %d > ", i);
            array[i] = Integer.parseInt(sc.nextLine());
        }

        // nhập chỉ số cần xóa
        System.out.print("Nhập chỉ số cần xóa > ");
        int deleteIndex = Integer.parseInt(sc.nextLine());


        // thực hiện xóa
        int[] newArray = new int[n-1];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == deleteIndex) {
                continue;
            }

            newArray[index] = array[i];
            index ++;
        }

        System.out.println("Mảng sau khi xóa " + Arrays.toString(newArray));


    }
}
