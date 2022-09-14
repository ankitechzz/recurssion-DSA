public class PrintFactorialOfAnumber {
    static int Calcfactorial(int n){
        if (n == 1 || n == 0){  // base
            return 1;
        }
        //work
        Calcfactorial(n-1); // recursive call
          int fact_n = Calcfactorial(n-1); // i.e.  n(n-1) = n!
          int fact_m = n*fact_n;
          return fact_m;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Calcfactorial(n));
    }
}
