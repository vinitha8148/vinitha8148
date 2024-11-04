public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,1,2,3,4,5,6,7,8};
      boolean[] counted=new boolean[arr.length];
        for(int i=0;i<arr.length;i++) {
            if(counted[i]) {
                continue;
            }
              int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                count ++; 
                    counted[j]=true;
                }
            }
            System.out.println(arr[i]+ " appears "+count+" times");
        }
    }
}