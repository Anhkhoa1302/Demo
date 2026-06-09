package Demo;
import java.util.Scanner;
public class sofinabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        sc.nextLine();
        int i = 0;
        int a = 0;
        int b = 1;
        int c = 0;
        while (c < n ){
        System.out.print(a +" ");
        c = a + b;
        a = b;
        b =c;
        i++;
        }
    }
}
