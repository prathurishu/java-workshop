public class methods {
    public void method1(int a) {
        System.out.println("a:" +a);
        return ;
    }

    public void method2(float b) {
        System.out.println("b:" +b);
        return ;
    }
    public void method3(int a, float b){
        double sum = a+b;
        double square = (a+b)* (a+b);
        System.out.println("Sum of two numbers is:"+sum);
        System.out.println("square of the sum of two number is:" +square);
        return ;
    }

    public static void main(String[] args) {
        methods methods = new methods();
        methods.method1(10);
        methods.method2(10);
        methods.method3(10,10);
    }
}
