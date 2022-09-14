public class PrintStackHeight {
     // n is always decreasing
        /*
        1. given -- int x and n
        2. work -- we have to calculate x^n. n is the umber of stacks.
                    x^n = x*(x^n-1)

        3. base case = when x =0 && n =0

                */
     static int Stack(int x, int n){
         if (n == 0){ //base1
           return 1;
         }
         if (x == 0){ //base2
             return 0;
         }
         int power = Stack(x, n-1); // recursion
           int power1 = x* power;
         return power1;
     }

    public static void main(String[] args) {
          int x = 2, n =5;
       int ans =  Stack(x,n);
        System.out.println(ans);
    }
}
