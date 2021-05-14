import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        double raio;

        raio = sc.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A=" + area);

        sc.close();
    }
}
