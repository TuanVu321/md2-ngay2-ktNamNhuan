import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao nam muon kiem tra:");
        int year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("nam nhuan");
                } else {
                    System.out.println("nam khong nhuan");
                }
            } else {
                System.out.println("nam nhuan");
            }
        } else {
            System.out.println("nam khong nhuan");
        }
    }
}
