
import java.util.*;
public class popfunctioncheck
{
	public static void main(String[] args) {
	    int n=5;
	    int [] arr={1,2,3,4,5};
	    int [] pop1={4,5,3,2,1};
	    int index=0;
	    Stack<Integer> stack=new Stack<>();
	    for(int i=0;i<arr.length;i++){
	        stack.push(arr[i]);
	        while(!stack.isEmpty()&&stack.peek()==pop1[index]){
	        
	            stack.pop();
	            index++;
	        }
	    }
	    if(stack.isEmpty()){
	        System.out.println("true");
	    }
	    else{
	        System.out.println("false");
	    }
	}
}