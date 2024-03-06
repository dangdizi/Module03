import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        // Bài 5: Nhập từ bàn phím 3 số thực điểm toán, văn, anh.
        // Tính tổng điểm và điểm trung bình và in kết quả ra màn hình console (chính xác tới 2 số thập phân)

        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm môn toán > ");
        float toan = sc.nextFloat();

        System.out.print("Nhập điểm môn văn > ");
        float van = sc.nextFloat();

        System.out.print("Nhập điểm môn anh > ");
        float anh = sc.nextFloat();

        // tính toán
        float trungBinh = (toan + van + anh) / 3;

        System.out.printf("Điểm trung bình 3 môn là: %.2f", trungBinh);
    }
}
