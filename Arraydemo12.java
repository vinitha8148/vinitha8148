public class Arraydemo12
{
	public static void main(String[] args) {
	    int arr[]=new int[]{90,76,45,12,43,90,76,12,8};
	    boolean[] checked= new boolean[arr.length];
	    for(int i=0;i<arr.length;i++) {
	        if(checked[i]){
	            continue;
	        }
	        for(int j=i+1;j<arr.length-1;j++){
	            if(arr[i]==arr[j]) {
	            checked[j]= true;   
	                
	                
	                
	                
	            }
	        }
	        
	        
	        
	      System.out.print(arr[i]+" ");  
	    }
	        
	        
	        

	
	}
}