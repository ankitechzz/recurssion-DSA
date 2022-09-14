public class Practiice2 {
    static void Print1to5(int n){
        if(n == 6){  //base condition
            return;
        }
        System.out.println(n); // print first number
        Print1to5(n+1); //function calling itself . i.e. recursion
    }
    public static void main(String[] args) {
        int n =1;
        Print1to5(1);
    }
}
