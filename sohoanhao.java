package Demo;

import java.util.Scanner;

public class sohoanhao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        sc.nextLine();
        int i = 1;
        int sum = 0;
        while (i < n) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
      

    if(sum==n){
        System.out.println("La so hoan hao");
    }
    else{
        System.out.println("Khong phai la so hoan hao");
    }
}
}
