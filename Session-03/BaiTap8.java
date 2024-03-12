package Session03;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap8 {
    public static void main(String[] args) {
        // Bài 8: Nhập số phần tử của mảng (n),
        // khai báo và nhập giá trị các phần tử của mảng 1 chiều số nguyên.
        // Nhập giá trị (updateValue) và chỉ số  phần tử cần cập nhật (updateIndex),
        // thực hiện cập nhật giá trị updateValue vào phần tử có chỉ số updateIndex

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

        // nhập giá trị update value và chỉ số cập nhật
        System.out.print("Nhập giá trị cập nhật > ");
        int updateValue = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập chỉ số cập nhật > ");
        int updateIndex = Integer.parseInt(sc.nextLine());

        // cập nhật giá trị vào mảng
        array[updateIndex] = updateValue;

        System.out.println("Mảng sau khi cập nhật" + Arrays.toString(array));
    }
}
