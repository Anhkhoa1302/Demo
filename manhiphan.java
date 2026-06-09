package Demo;

import java.util.Scanner;

public class manhiphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        sc.nextLine();
        String a = "";
        int reminder=0;
        while (n>0){
            reminder = n % 2;
            a = a +reminder;
            n = n/2;

            
        }

    }
}
