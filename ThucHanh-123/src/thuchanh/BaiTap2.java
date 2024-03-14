package thuchanh;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng > ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số cột > ");
        int m = Integer.parseInt(sc.nextLine());

        // khai báo mảng 2 chiều
        int[][] array = new int[n][m];
        while (true) {
            System.out.println("***************************MENU****************************** \n" +
            "1.  Nhập giá trị các phần tử của mảng \n" +
            "2. In giá trị các phần tử mảng theo ma trận \n" +
            "3. Tính tổng các phần tử trên đường biên \n" +
            "4. In giá trị phần tử có chỉ số dòng bằng chỉ số cột \n" +
            "5. Thoát\n--------------\n");
            System.out.print("Lựa chọn >> ");
            int select = Integer.parseInt(sc.nextLine());

            switch (select) {
                case 1:
                    // nhập giá trị vào mảng
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.printf("Nhập giá trị tại [%d][%d] > ", i, j);
                            array[i][j] = Integer.parseInt(sc.nextLine());
                        }
                    }
                    break;
                case 2:
                    // In giá trị các phần tử mảng theo ma trận
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.printf("%3s", array[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    // tính tổng đường biên
                    int sum = 0;
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j <array[i].length; j++) {
                            if (i!=0 && i!=array.length -1) {
                                sum += array[i][0] + array[i][array[i].length-1];
                                break;
                            }
                            sum += array[i][j];
                        }

                    }

                    System.out.printf("Tổng đường biên: %d \n", sum);
                    break;
                case 4:
                    // In giá trị phần tử có chỉ số dòng bằng chỉ số cột
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.printf("%3s", i == j ? array[i][j] : "");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Hẹn gặp lại");
                    return;
                default:
                    System.err.println("Lựa chọn không phù hợp");

            }
        }
    }
}
