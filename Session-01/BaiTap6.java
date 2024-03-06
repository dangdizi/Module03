import java.util.Scanner;

public class BaiTap6 {
    public static void main(String[] args) {
        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất > ");
        int num1 = sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai > ");
        int num2 = sc.nextInt();
        System.out.print("Nhập số nguyên thứ ba > ");
        int num3 = sc.nextInt();

        // so sánh tìm lớn nhất
        int max;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }
        System.out.printf("Số lớn nhất là %d\n", max);


        // so sánh tìm số bé nhất
        int min;
        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        } else {
            min = num3;
        }
        System.out.printf("Số bé nhất là %d\n", min);
    }
}
