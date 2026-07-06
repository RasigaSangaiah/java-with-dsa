
import java.util.*;
public class Binarysearch
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int [] arr={2, 5, 6, 8, 10, 13, 17};
	    int tar=10;
	    int left=0;
	    int right=arr.length;
	    
	    while(left<=right){
	        int mid=(left+right)/2;
	        if(arr[mid]==tar){
	            System.out.println("Found: "+mid);
	            return;
	        }
	        else if(arr[mid]<tar){
	            left=mid+1;
	            
	        }
	        else if(arr[mid]>tar){
	            right=mid-1;
	        }
	        
	    
	    	   
	       
	        
	    }
	     System.out.println("Not Found");

		
	}
}