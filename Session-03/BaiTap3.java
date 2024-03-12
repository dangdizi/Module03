package Session03;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        // Bài 3: Nhập vào số dòng và cột của mảng 2 chiều (row * col),
        // khai báo và nhập giá trị các phần tử mảng số nguyên 2 chiều.
        // In giá trị các phần tử mảng theo ma trận

        // nhập hàng và cột
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng > ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số cột của mảng > ");
        int col = Integer.parseInt(sc.nextLine());

        // khai báo mảng ma trận
        int[][] array = new int[row][col];

        // nhập phần tử mảng
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Nhập phần tử hàng %d cột %d > ", i, j);
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        // biểu diễn thành ma trận
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(" %d ", array[i][j]);
            }
            System.out.println("");
        }
    }
}
