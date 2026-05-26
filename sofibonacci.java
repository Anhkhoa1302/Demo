package Demo;

public class sofibonacci {
    public static void main(String[] args) {
        int i = 0;
        int a = 0;
        int b = 1;
        int c;
        while (i < 15) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }

    }
}
