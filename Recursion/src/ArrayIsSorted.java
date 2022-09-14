public class ArrayIsSorted {
    static Boolean essentials(int arr[], int index){
       if (arr[index]<arr[index]+1){
           essentials(arr,index+1);
           return true;
       }
       else {
           return false;
       }
    }
    public static void main(String[] args) {
         int array[] = {1,2,3,4};
         int index;
        essentials(array,0);
    }
}


//input
// {1,2,3,4}
// yes array is sorted