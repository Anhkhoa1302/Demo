package Demo;
import java.util.Scanner;
public class giaithua {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so n: ");
    int n = sc.nextInt();
    sc.nextLine();
    int giaithua = 1;
    for(int i=n; i>=1;i--){
       giaithua= giaithua * i;   
    }
System.out.println("So giai thua cua n la: "+ giaithua);
 }
}
