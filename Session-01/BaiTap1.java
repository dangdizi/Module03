import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên > ");
        int soNguyen = sc.nextInt();
        System.out.printf("bình phương của số nguyên %d là %d", soNguyen, soNguyen * soNguyen);
    }
}
