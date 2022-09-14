public class SumOfnNaturalNumbers {
    static void sum(int i, int n, int sum){
        if (i == n){  //base
            sum = sum+i;
            System.out.println(sum);
            return;
        }
        sum = sum+i;
        sum(i+1,n,sum); //sum
    }
    public static void main(String[] args) {
      sum(0,5,0);
    }
}
