import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b, tong, hieu, tich, thuong;
        System.out.printf("Chương trinh tính toán cộng trừ nhân chia\n");
        System.out.println("Nhập số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        b = scanner.nextInt();
        tong = a+b;
        System.out.println("Phép cộng: " + tong);
        hieu = a-b;
        System.out.println("Phép trừ: " + hieu);
        tich = a*b;
        System.out.println("Phép nhân: " +tich);
        thuong = a/b;
        System.out.println("Phép chia: " +thuong);
    }
}