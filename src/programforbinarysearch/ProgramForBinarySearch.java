
package programforbinarysearch;


public class ProgramForBinarySearch {
    // Returns index of x if it is present in arr[], else return -1
    public static int binary(int arr[],int x) 
    {
        int a=0;
        int z=arr.length-1;
        while(a<=z)
        {
            int mid = 1+(z-1)/2;
            // Check if x is present at mid 
            if(arr[mid]==x)
                return mid;
            // If x is smaller, ignore right half
            if(arr[mid]>x)
                z=mid-1;
            // If x greater, ignore left half
            else
                a=mid+1;  
        }
        return -1;
    }

    
    public static void main(String[] args) {
        ProgramForBinarySearch ob;
        ob = new ProgramForBinarySearch();
        
        int arr[]={0,4,5,6,7,81,2,3,9};
        int x = 5;
        int result = ob.binary(arr,x);
        if(result==-1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " +  
                                   "index " + result);
       
    }
    
}
