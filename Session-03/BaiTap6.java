package Session03;

import java.util.Scanner;

public class BaiTap6 {
    public static void main(String[] args) {
        // Bài 6: Nhập số phần tử của mảng (n),
        // khai báo và nhập giá trị các phần tử của mảng 1 chiều số nguyên.
        // Nhập vào một giá trị (findNumber),
        // in ra chỉ số các phần tử và tổng các phần tử có giá trị bằng giá trị findNumber

        // nhập số phần tử mảng n
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng > ");
        int n = Integer.parseInt(sc.nextLine());

        // khai báo mảng 1 chiều
        int[] array = new int[n];

        // nhập giá trị các phần tử của mảng
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị phẩn tử %d > ", i);
            array[i] = Integer.parseInt(sc.nextLine());
        }

        // nhập findNumber
        System.out.print("Nhập số tìm kiếm > ");
        int findNumber = Integer.parseInt(sc.nextLine());

        // tìm kiếm bằng nhau và tổng bằng nhau
        for (int i = 0; i < n; i++) {
            if (array[i] == findNumber) {
                System.out.printf("Phần tử index:%d = findNumber = %d\n", i, findNumber);
            }

            // lặp qua tìm tổng
            for (int j = i+1; j < n; j++) {
                if (array[i] + array[j] == findNumber) {
                    System.out.printf("Phần tử index:%d + index:%d => %d + %d = %d\n", i, j, array[i], array[j], findNumber);
                }
            }
        }
    }
}
