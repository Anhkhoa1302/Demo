package Demo;

import java.util.Scanner;

public class songuyento {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so n: ");
    int n = sc.nextInt();
    sc.nextLine();
    int count = 0;
    for(int i = 1; i<=n; i++){
       if ( n % i==0){
         count++;
       }
      
    }

if(count==2) {
        System.out.println("la so nguyen to");
    }
     else    {
        System.out.println("khong la so nguyen to");
    }
}
}

