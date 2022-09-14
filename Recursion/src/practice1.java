public class practice1 {
    static void PrintNumber(int n){
        if (n == 0){   //base condition
            return;
        }
        System.out.println(n); //print
        PrintNumber(n-1); // ----------------->   recursion
    }
    public static void main (String[] args) {
//Print numbers from 5 to 1
               int n =5;
             PrintNumber(5);
        }
                       }

                       //uses memeory as stack .  // uses a lot of memory because calling functions lot. // if we dont use base case it will lead to sstackoverflow.



