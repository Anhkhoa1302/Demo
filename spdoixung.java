package Demo;

import java.util.Scanner;

public class spdoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        sc.nextLine();
int sodao = 0;
int kq = 0;
int kqss = n;
while (n > 0){
sodao = n % 10;
kq = kq *10 + sodao;
n = n/10;

}
if (kq == kqss){
    System.out.println("la so doi xung");
}
else{
    System.out.println("Khong phai la so doi xung");
}
    }
}
