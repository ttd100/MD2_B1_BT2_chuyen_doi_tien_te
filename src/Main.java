import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chương trình chuyển  đổi tiền tệ ");
        int rate = 23000;
        System.out.println("nhập số tiền cần chuyển đổi(đơn vị USD)");
        int USD = scanner.nextInt();
        int VND = USD * rate;
        System.out.printf("%d USD = %d VND", USD,VND);
    }
}