public class MyCalculator implements Calculator {
    int a;
    int b;

    public MyCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add(int a, int b){
        return a+b;
}
public int substract(int a,int b){
        return a-b;
}
    public int multiply(int a, int b){
        return a*b;
}
    public double divide(double a, double b){
    return a/b;}
}