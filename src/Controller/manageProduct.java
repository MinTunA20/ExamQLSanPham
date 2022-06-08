package Controller;

import IO.ReaderAndWriteProduct;
import Model.Product;
import Sort.SortByPrize;
import validate.ValidateProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class manageProduct {
    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();
    ValidateProduct validateProduct = new ValidateProduct();
    ReaderAndWriteProduct readerAndWriteProduct = new ReaderAndWriteProduct();
    public void menu() {
        System.out.println("Chương trình quản lý sản phẩm");
        System.out.println("1. Hiển thị");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Sản phẩm có giá trị đắt nhất: ");
        System.out.println("7. Đọc file");
        System.out.println("8. Ghi file");
        System.out.println("9. Thoát");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                show();
                break;
            case 2:
                createProduct();
                break;
            case 3:
                editProduct();
                break;
            case 4:
                deleteStudent();
                break;
            case 5:
                sortByPrize();
                break;
            case 6:
            case 7:
                readerAndWriteProduct.write(products);
                System.out.println("đã ghi");
                break;
            case 8:
        }
    }
    public void show() {
        for (int i = 0; i < products.size(); i++) {
            if (i % 5 == 0 && i != 0) {
                scanner.nextLine();
            } else {
                System.out.println(products.get(i));
            }
        }
    }

    public Product createProduct() {
        int Id = validateProduct.validateID(products);
        String Name = validateProduct.validateString("Tên sản phẩm: ");
        int Prize = validateProduct.validatePrize();
        int Amount = validateProduct.validateAmount();
        String Describe = validateProduct.validateString("Địa chỉ");


        return new Product(Id, Name, Prize, Amount, Describe);
    }
    public void editProduct() {
        System.out.println("Nhập id cần sửa ");
        int Id = Integer.parseInt(scanner.nextLine());
        int index = validateProduct.getIndexId(Id, products);
        if (index != -1){
            products.set(index, createProduct());
        } else System.out.println("Id không tồn tại");
    }

    public void deleteStudent() {
        System.out.println("Nhập id cần xóa ");
        int Id = Integer.parseInt(scanner.nextLine());
        int index = validateProduct.getIndexId(Id, products);
        if (index != -1){
            System.out.println();
            products.remove(index);
        } else System.out.println("Id không tồn tại");
    }

    public void sortByPrize(){
        products.sort(new SortByPrize());
        System.out.println(" Đã sắp xếp");
    }
}

