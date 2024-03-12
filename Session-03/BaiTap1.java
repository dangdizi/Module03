package Session03;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap1 {
    // Bài 1: Khai báo mảng số nguyên gồm 5 phần tử, nhập giá trị các phần tử từ bàn phím và in ra giá trị các phần tử của mảng

    public static void main(String[] args) {
        Integer[] soNguyen = new Integer[5];

        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < soNguyen.length; i++) {
            System.out.printf("Nhập số nguyên thứ %d > ", i + 1);
            int num = Integer.parseInt(sc.nextLine());
            soNguyen[i] = num;
        }

        for (int num : soNguyen) {
            System.out.println(num);
        }
    }
}
