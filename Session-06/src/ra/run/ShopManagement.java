package ra.run;

import ra.entity.Categories;
import ra.entity.Product;

import java.lang.reflect.Array;
import java.util.*;

public class ShopManagement {
    public static Scanner sc = new Scanner(System.in);
    private static Categories[] listCategories = new Categories[100];
    private static Product[] listProducts = new Product[100];
    private static int categorySize = 3;
    private static int productSize = 3;
    public static void main(String[] args) {
        listCategories[0] = new Categories(1, "áo quần", "", true);
        listCategories[1] = new Categories(2, "giày dép", "", true);
        listCategories[2] = new Categories(3, "điện tử", "", true);

        listProducts[0] = new Product("1", "áo màu đen", 200000, "", new Date(), 1, 0);
        listProducts[1] = new Product("2", "áo màu đen", 100000, "", new Date(), 1, 0);
        listProducts[2] = new Product("3", "áo màu đen", 400000, "", new Date(), 1, 0);
        shopMenu();
    }

    public static void shopMenu() { // phương thức quản lý shop menu
        while (true) {
            System.out.println("******************SHOP MENU*******************\n" +
            "1.\tQuản lý danh mục sản phẩm\n" +
            "2.\tQuản lý sản phẩm\n" +
            "3.\tThoát\n");
            System.out.print("Nhập lựa chọn > ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    categoriesMenu();
                    break;
                case 2:
                    productManagement();
                    break;
                case 3:
                    System.out.println("Đã thoát chương trình");
                    return;
                default:
                    System.err.println("Lựa chọn không phù hợp");
                    break;
            }
        }


    }

    public static void categoriesMenu() { // phương thức quản lý danh mục sản phẩm
        while (true) {
            System.out.println("********************CATEGORIES MENU***********\n" +
            "1.\tNhập thông tin các danh mục\n" +
            "2.\tHiển thị thông tin các danh mục\n" +
            "3.\tCập nhật thông tin danh mục\n" +
            "4.\tXóa danh mục\n" +
            "5.\tCập nhật trạng thái danh mục\n" +
            "6.\tThoát\n");
            System.out.print("Nhập lựa chọn > ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    // nhập thông tin các danh mục
                    System.out.print("Nhập số danh mục cần thêm > ");
                    int count = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < count; i++) {
                        System.out.print("Nhập id danh mục > ");
                        int catalogId = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhập tên danh mục > ");
                        String catalogName = sc.nextLine();
                        System.out.print("Nhập chi tiết danh mục > ");
                        String descriptions = sc.nextLine();
                        System.out.print("Nhập trạng thái danh mục > ");
                        boolean catalogStatus = Boolean.parseBoolean(sc.nextLine());

                        // tạo ra danh mục mới
                        Categories newCategories = new Categories(catalogId, catalogName, descriptions, catalogStatus);
                        // gán vào mảng chính
                        listCategories[categorySize] = newCategories;
                        categorySize = categorySize + 1;
                        System.out.println("Thêm danh mục thành công\n----------------------------------------------");
                    }

                    break;
                case 2:
                    // hiển thị thông tin các danh mục
                    for (int i = 0; i < categorySize; i++) {
                        Categories item = listCategories[i];
                        System.out.println("-------------------------------------------------------------\nmã danh mục: " + item.getCatalogId());
                        System.out.println("tên danh mục: " + item.getCatalogName());
                        System.out.println("chi tiết danh mục: " + item.getDescriptions());
                        System.out.println("trạng thái danh mục: " + (item.isCatalogStatus() ? "Đang hoạt động" : "Ngừng hoạt động") + "\n-------------------------------------------------------------\n");
                    }
                    break;
                case 3:
                    // cập nhật thông tin danh mục
                    System.out.print("Nhập Id danh mục cần cập nhật > ");
                    int id = Integer.parseInt(sc.nextLine());
                    int findIndex = findCategoryIndex(id);

                    // kiểm tra có tồn tại id không
                    if (findIndex == -1) {
                        System.err.println("Không tìm thấy danh mục");
                    } else {
                        // hiển thị dữ liệu cũ
                        Categories item = listCategories[findIndex];
                        System.out.println("mã danh mục: " + item.getCatalogId());
                        System.out.println("tên danh mục: " + item.getCatalogName());
                        System.out.println("chi tiết danh mục: " + item.getDescriptions());
                        System.out.println("trạng thái danh mục: " + (item.isCatalogStatus() ? "Đang hoạt động" : "Ngừng hoạt động"));

                        // nhập thông tin
                        System.out.print("Nhập tên danh mục > ");
                        item.setCatalogName(sc.nextLine());
                        System.out.print("Nhập chi tiết danh mục > ");
                        item.setDescriptions(sc.nextLine());
                        System.out.print("Nhập trạng thái danh mục > ");
                        item.setCatalogStatus(Boolean.parseBoolean(sc.nextLine()));

                        System.out.println("Đã cập nhật thông tin");
                    }
                    break;
                case 4:
                    // xóa danh mục
                    System.out.print("Nhập id danh mục cần xóa > ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    int deleteIndex = findCategoryIndex(deleteId);
                    // kiểm tra tồn tại
                    if (deleteIndex == -1) {
                        System.out.println("Danh mục không tồn tại");
                    } else {
                        listCategories[deleteIndex] = new Categories();
                        categorySize = categorySize - 1;
                        System.out.println("Đã xóa danh mục");
                    }
                    break;
                case 5:
                    // cập nhật trạng thái danh mục
                    System.out.print("Nhập id danh mục cần đổi trạng thái > ");
                    int idUpdate = Integer.parseInt(sc.nextLine());
                    int indexUpdate = findCategoryIndex(idUpdate);

                    // kiểm tra tồn tại id danh mục
                    if (indexUpdate == -1) {
                        System.err.println("Không tìm thấy danh mục");
                    } else {
                        System.out.print("Nhập trạng thái danh mục > ");
                        boolean statusUpdate = Boolean.parseBoolean(sc.nextLine());
                        listCategories[indexUpdate].setCatalogStatus(statusUpdate);
                        System.out.println("Đã cập nhật trạng thái");
                    }
                    break;
                case 6:
                    System.out.println("Đã thoát chương trình");
                    return;
                default:
                    System.err.println("Lựa chọn không phù hợp");
                    break;
            }
        }
    }

    public static void productManagement () { // phương thức quản lý sản phẩm
        while (true) {
            System.out.println("*******************PRODUCT MANAGEMENT*****************\n" +
            "1.\tNhập thông tin các sản phẩm\n" +
            "2.\tHiển thị thông tin các sản phẩm\n" +
            "3.\tSắp xếp các sản phẩm theo giá\n" +
            "4.\tCập nhật thông tin sản phẩm theo mã sản phẩm\n" +
            "5.\tXóa sản phẩm theo mã sản phẩm\n" +
            "6.\tTìm kiếm các sản phẩm theo tên sản phẩm\n" +
            "7.\tTìm kiếm sản phẩm trong khoảng giá a – b (a,b nhập từ bàn phím)\n" +
            "8.\tThoát\n");
            System.out.print("Nhập lựa chọn > ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    // nhập thông tin sản phẩm
                    System.out.print("Nhập số sản phẩm cần thêm > ");
                    int count = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < count; i++) {
                        System.out.print("Nhập id sản phẩm > ");
                        String productId = sc.nextLine();
                        System.out.print("Nhập tên sản phẩm > ");
                        String productName = sc.nextLine();
                        System.out.print("Nhập giá sản phẩm > ");
                        int price = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhập mô tả sản phẩm > ");
                        String descriptions = sc.nextLine();
                        System.out.println("Chọn danh mục sản phẩm");
                        for (int j = 0; j < categorySize; j++) {
                            System.out.printf("[%d] - %s\n", j+1, listCategories[j].getCatalogName());
                        }
                        int catalogIndex = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhập trạng thái sản phẩm > ");
                        int productStatus = Integer.parseInt(sc.nextLine());
                        Product newProduct = new Product(productId, productName, price, descriptions, new Date(), listCategories[catalogIndex-1].getCatalogId(), productStatus);
                        // gán đối tượng cho mảng
                        listProducts[productSize] = newProduct;
                        productSize = productSize + 1;
                    }
                    break;
                case 2:
                    // hiển thị thông tin sản phẩm
                    for (int i = 0; i < productSize; i++) {
                        Product item = listProducts[i];
                        System.out.println("Mã sản phẩm: " + item.getProductId());
                        System.out.println("Tên sản phẩm: " + item.getProductName());
                        System.out.println("giá sản phẩm: " + item.getPrice());
                        System.out.println("Mô tả sản phẩm: " + item.getDescription());
                        System.out.println("Danh mục sản phẩm: " + listCategories[findCategoryIndex(item.getCatalogId())].getCatalogName());
                        System.out.printf("Trạng thái sản phẩm: %s\n", item.getProductStatus() == 0 ? "Đang bán" : item.getProductStatus() == 1 ? "Hết hàng" : "Không bán");
                        System.out.println("----------------------------------------------------------");
                    }
                    break;
                case 3:
                    // sắp xếp các mảng theo giá
                    System.out.println("1. sắp xếp tăng dần\n" +
                    "2. sắp xếp giảm dần\n");
                    System.out.print("Lựa chọn > ");
                    int choice1 = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < productSize; i++) {
                        for (int j = i+1; j < productSize; j++) {
                            Product cache;
                            if (choice1 == 1) {
                                if (listProducts[i].getPrice() > listProducts[j].getPrice()) {
                                    cache = listProducts[i];
                                    listProducts[i] = listProducts[j];
                                    listProducts[j] = cache;
                                }
                            } else {
                                if (listProducts[i].getPrice() < listProducts[j].getPrice()) {
                                    cache = listProducts[i];
                                    listProducts[i] = listProducts[j];
                                    listProducts[j] = cache;
                                }
                            }

                        }
                    }
                    System.out.println("Đã sắp xếp sản phẩm");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Đã thoát chương trình");
                    return;
                default:
                    System.err.println("Lựa chọn không phù hợp");
                    break;
            }
        }
    }

    public static int findCategoryIndex (int categoryId) { // hàm tìm kiếm vị trí của category theo id
        for (int i = 0; i < categorySize; i++) {
            if (categoryId == listCategories[i].getCatalogId()) {
                return i;
            }
        }
        return -1;
    }

    public static void renderProduct (Product product) {
        System.out.printf("");
    }





}
