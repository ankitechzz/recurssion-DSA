public class TowerOfHanoi {
    static void corecode(int n, String src, String helper, String dest){
        //base
        if (n == 1) {
            System.out.println("Transfered Disk " + n + " from " + src + " to " + dest  );
            return;
        }
        corecode(n-1,src,dest,helper);
        System.out.println("Transfered Disk " + n + " from " + src + " to " + dest);
        corecode(n-1,helper,src,dest);

    }

    public static void main(String[] args) {
     int n = 3;
     corecode(n,"S","H","D");
    }
}
