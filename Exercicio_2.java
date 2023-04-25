import java.util.Scanner;

public class Exercicio_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        Integer num = scanner.nextInt();

        Integer a = 0;
        Integer b = 1;

        Integer c = 0;

        while(b < num){
            c = a + b;
            a = b;
            b = c;
        }
        if(b == num){
            System.out.println("O numero: "+ num + " faz parte da sequencia de fibonnaci");
        }else{
            System.out.println("O numero: "+ num + " não faz parte da sequencia de fibonnaci");
        }
    }
}
