import java.util.Scanner;

public class Exercicio_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = scanner.nextInt();

        Integer a = 0;
        Integer b = 1;

        Integer c = 0;

        while(b < num){
            c = a + b;
            a = b;
            b = c;
        }
    }
}
