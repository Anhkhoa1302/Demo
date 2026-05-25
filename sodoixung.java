package Demo;

import java.util.Scanner;

public class sodoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so doi xung: ");
        int c = sc.nextInt();
        sc.nextLine();
        int sodao = 0;
        int kq = 0;
        int kqss = c;
        while (c > 0) {
            sodao = c % 10;
            kq = kq * 10 + sodao;
            c = c / 10;
        }
        if(kqss==kq){
                    System.out.println("La so doi xung: " + kqss);

        }
        else{
               System.out.println("Khong la so doi xung: " + kqss); 
        }
     
    }
}
