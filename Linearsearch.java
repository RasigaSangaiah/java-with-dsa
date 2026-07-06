
import java.util.*;
public class Linearsearch
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int [] arr={5, 7, 2, 3, 10, 1};
	    int tar=3;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==tar){
	            System.out.println("Found: "+i);
	            return;
	        }
	        
	    }
	    System.out.println("Not Found");
		
	}
}