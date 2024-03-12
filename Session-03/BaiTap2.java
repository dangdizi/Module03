package Session03;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        // Bài 2: Nhập vào số phần tử (n) của mảng 1 chiều, khai báo và nhập giá trị các phần tử của mảng một chiều số thực gồm n phần tử. In ra giá trị trung bình cộng của các phần tử trong mảng

        // nhập vào n số phần tử
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng > ");
        int n = Integer.parseInt(sc.nextLine());
        int[] listNumber = new int[n];

        for (int i = 0; i < listNumber.length; i++) {
            // nhập phần tử mảng
            System.out.printf("Nhập phần tử %d của mảng > ", i + 1);
            int num = Integer.parseInt(sc.nextLine());
            listNumber[i] = num;
        }

        // tính giá trị trung  bình cộng
        int total = 0;

        // cộng phần tử mảng
        for (int num : listNumber) {
            total += num;
        }

        System.out.printf("Trung bình cộng của mảng là %d", total / listNumber.length);
    }
}
