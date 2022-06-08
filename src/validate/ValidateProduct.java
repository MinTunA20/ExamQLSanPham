package validate;

import Model.Product;

import java.util.List;
import java.util.Scanner;

public class ValidateProduct {
    Scanner scanner = new Scanner(System.in);
    public int validateID(List<Product> products){
        while (true){
            try {
                System.out.println("Nhập mã sản phẩm");
                int Id = Integer.parseInt(scanner.nextLine());
                if (getIndexId(Id, products) != -1){
                    throw new Exception();
                }
                return Id;
            } catch (Exception e){
                System.out.println("Nhập lại mã");
            }
        }
    }

    public int getIndexId(int Id, List<Product> students){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == Id){
                return i;
            }
        }
        return -1;
    }

    public String validateString(String Name){
        while (true) {
            System.out.println("nhập " + Name);
            String str = scanner.nextLine();
            if (Name.equals("")) {
                System.out.println("Lỗi");
                continue;
            } else {
                return str;
            }
        }
    }

    public  int validatePrize(){
        while (true){
            try {
                System.out.println("Nhập giá");
                int Prize = Integer.parseInt(scanner.nextLine());
                return Prize;
            } catch (Exception e){
                System.out.println("lỗi ");
            }
        }
    }

    public  int validateAmount(){
        while (true){
            try {
                System.out.println("Nhập số lượng");
                int Amount = Integer.parseInt(scanner.nextLine());
                return Amount;
            } catch (Exception e){
                System.out.println("lỗi ");
            }
        }
    }
}
