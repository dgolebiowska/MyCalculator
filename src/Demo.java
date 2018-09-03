import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("wybierz działanie( +, -, *, /)");
        String k= sc.next();
        System.out.println("wprowdz liczbę a");
        int a =sc.nextInt();
        System.out.println("wprowadz liczbę b");
        int b=sc.nextInt();
        MyCalculator calculator=new MyCalculator(a,b);
        switch (k) {
            case "+":
                System.out.println(calculator.add(a,b));
                break;
            case "-":
                System.out.println(calculator.substract(a,b));
                break;
            case "*":
                System.out.println(calculator.multiply(a,b));
                break;
            case "/":
                System.out.println(calculator.divide(a,b));
                break;
            default:
                System.out.println("sprzeczność");
        }
    }
}
