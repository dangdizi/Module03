package Session03;

import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        // Bài 4: Nhập số phần tử và giá trị các phần tử của mảng một chiều số nguyên.
        // Tìm giá trị lớn nhất và nhỏ nhất trong mảng

        // nhập số phần tử
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng > ");
        int count = Integer.parseInt(sc.nextLine());

        // khởi tạo mảng một chiều
        int[] array = new int[count];

        // nhập giá trị mảng
        for (int i = 0; i < count; i++) {
            System.out.printf("Nhập phần tử số %d > ", i + 1);
            array[i] = Integer.parseInt(sc.nextLine());
        }

        // tìm số lớn nhất và bé nhất
        int min = array[0], max = min;
        for (int num : array) {
            // kiểm tra điều kiện xác định số nhỏ
            if (num <= min) {
                min = num;
            }

            // kiểm tra điều kiện xác định số lớn
            if (num >= max) {
                max = num;
            }
        }

        System.out.printf("Số nhỏ nhất: %d | số lớn nhất: %d", min, max);
    }
}
