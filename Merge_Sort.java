public class MyMergeSort  
{  
public static void merge(int arr[], int beg, int mid, int end)  
{  
  
int l = mid - beg + 1;  
int r = end - mid;  
  
int LeftArray[] = new int [l];  
int RightArray[] = new int [r];  
  
for (int i=0; i<l; ++i)  
LeftArray[i] = arr[beg + i];  
  
