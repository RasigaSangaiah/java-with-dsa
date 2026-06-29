// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class pivot{
    public static void main(String[] args) {

        int n=6;
        int [] arr={1 ,4 ,5 ,8 ,7 ,3};
        
        int totsum=0;
        for(int i=0;i<n;i++){
            totsum+=arr[i];
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            int rightsum=totsum-leftsum-arr[i];
            if(leftsum==rightsum){
                System.out.print(i);
                return;
            }
            leftsum+=arr[i];
        }
        System.out.println("No Equilibriam index");
        
    }
}