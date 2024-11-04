public class ArrayDemo7
{
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,100,5,6,7,8,1000,9,10};
        int max=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(max>arr[i]){ //0<1,
            max=arr[i];
                
            }

        }
	   System.out.println("The largest element in an array is "+max);
	}
}