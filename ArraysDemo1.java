public class ArraysDemo1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,1,2,2,3,4,4,4,5,5,5};
        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
             System.out.println(arr[i] + " appears " + count + " times");
        }
    }
}