package thuchanh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhập chiều dài mảng
        System.out.print("Nhập số phần tử  > ");
        int n = Integer.parseInt(sc.nextLine());

        // khai báo mảng
        int[] array = new int[n];

       while (true) {
           System.out.println("*********************MENU********************** \n" +
                   "1.\tNhập giá trị các phần tử của mảng\n" +
                   "2.\tIn ra các phần tử của mảng \n" +
                   "3.\tThay đổi giá trị phần tử mảng theo vị trí index\n" +
                   "4.\tTính tổng các phần tử của mảng \n" +
                   "5.\tIn giá trị các phần tử là chẵn \n" +
                   "6.\tSắp xếp mảng tăng dần \n" +
                   "7.\tThoát\n------------------\n");
           System.out.print("Lựa chọn >> ");
           int select = Integer.parseInt(sc.nextLine());

           switch (select) {
               case 1:
                   // nhập giá trị phần tử mảng
                   for (int i = 0; i <array.length; i++) {
                       System.out.printf("Nhập giá trị tại index:%d > ", i);
                       array[i] = Integer.parseInt(sc.nextLine());
                   }
                   break;
               case 2:
                   // in ra phần tử mảng
                   for (int i = 0; i <array.length; i++) {
                       System.out.printf("%d, ", i);
                   }
                   System.out.println();
                   break;
               case 3:
                   // thay đổi giá trị phần tử mảng theo vị trí index
                   System.out.print("Giá trị thay đổi >> ");
                   int updateValue = Integer.parseInt(sc.nextLine());
                   System.out.print("Vị trị thay đổi >> ");
                   int updateIndex = Integer.parseInt(sc.nextLine());

                   array[updateIndex] = updateValue;
                   System.out.println("Đã cập nhật xong");
                   break;
               case 4:
                   // Tính tổng các phần tử của mảng
                   int sum = 0;
                   for (int i = 0; i <array.length; i++) {
                       sum += array[i];
                   }

                   System.out.printf("Tổng các phần tử mảng là: %d\n", sum);
                   break;
               case 5:
                   // In giá trị các phần tử là chẵn
                   for (int i = 0; i <array.length; i++) {
                       if (array[i] % 2 == 0) {
                           System.out.printf("%d là số chắn \n", array[i]);
                       }
                   }
                   break;
               case 6:
                   // sắp xếp mảng tăng dần
                   for (int i = 0; i < array.length; i++) {
                       int cache = array[0]; // biến trung gian lưu trữ tạm thời
                       for (int j = i + 1; j < array.length; j++) {
                            if (array[j] < array[i]) {
                                cache = array[i];
                                array[i] = array[j];
                                array[j] = cache;
                            }
                       }
                   }
                   System.out.println(Arrays.toString(array));
                   break;
               case 7:
                   // thoát
                   System.out.println("Bye! hẹn gặp lại bạn!");
                   return;
               default:
                   System.err.println("Lựa chọn không phù hợp");
           }

       }
    }
}
