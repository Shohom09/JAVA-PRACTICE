public class Binary_Search{ 

 public static void BinarySearch(int array[], int first, int last, int k){  
   
   int mid = (first + last)/2;  
   
   while( first <= last )
   {  
         if ( array[mid] < k )
         {  
        first = mid + 1;     
        }
        
      
      else if ( array[mid] == k )
      {  
        System.out.println("Element is found at position: " + mid);  
        break;  
      }

      else
      {  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      
      System.out.println("Element is not found!");  
   }  
 }  