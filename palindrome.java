public class palindrome {

    public static void main(String[] args) {

        String str="madam";
        int left=0;
        int right=str.length()-1;
        boolean ispali=true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                ispali=false;
                break;
            }
            left++;
            right--;
        }
        if(ispali){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}