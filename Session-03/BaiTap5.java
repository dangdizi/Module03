package Session03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        // Bài 5: Nhập số phần tử của mảng số thực 2 chiều (row*col),
        // khai báo và nhập giá trị các phần tử mảng 2 chiều số thực (row*col),
        // in ra gia tri các phần tử có giá trị chẵn và tính tổng các phần tử đó

        // nhập số phần tử của mảng c2 chiều
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng > ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số cột của mảng > ");
        int col = Integer.parseInt(sc.nextLine());

        // khai báo mảng
        float[][] listFloat = new float[row][col];

        // nhập giá trị mảng
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < listFloat[i].length; j++) {
                System.out.printf("Nhập giá trị hàng %d cột %d > ", i, j);
                listFloat[i][j] = Float.parseFloat(sc.nextLine());
            }
        }

        // in ra các giá trị có phần tử chẵn
        float total = 0;
        System.out.println("Các phần tử là số chẵn");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < listFloat[i].length; j++) {
                float item = listFloat[i][j];
                if (item % 2 != 0) {
                    System.out.print("    XXXX    ");
                } else {
                    System.out.printf("    %.2f    ", item);
                    total += item;
                }
            }
            System.out.println("");
        }

        // hiển thị tổng
        System.out.printf("Tổng của các số chẵn là %.2f", total);
    }
}
