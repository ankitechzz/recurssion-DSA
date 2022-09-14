public class FibonacciSeries {
    static void Series(int a, int b, int n) {
       if (n == 0){
           return;
       }
       int c = a+b;
        System.out.println(c);
        Series(b,c,n-1);
        System.out.println();
    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        Series(a, b, n - 2);// because we already took 2 numbers 0 and 1
    }
}
