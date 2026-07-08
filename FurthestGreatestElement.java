
public class FurthestGreatestElement
{
	public static void main(String[] args) {
	    int [] arr={5, 2, 7, 1, 3, 8, 4};
	   
	    for(int i=0;i<arr.length;i++){
	         int temp=-1;
	        for(int j=arr.length-1;j>=i;j--){
	            if(arr[i]<arr[j]){
	                temp=arr[j];
	                break;
	            }
	        }
	       System.out.print(temp+" ");
	                     
	    }
	     
	}
}