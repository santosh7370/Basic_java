public class SortArray  
{  
public static void main(String[] args)   
{   
int[] arr = new int[] {78,32,-32,54,6,-2,1,67,-54,-21,-32,23,44};  
System.out.println("Array elements after sorting:");   
for (int i = 0; i < arr.length; i++)   
{  
for (int j = i + 1; j < arr.length; j++)   
{  
int tmp = 0;  
if (arr[i] > arr[j])   
{  
tmp = arr[i];  
arr[i] = arr[j];  
arr[j] = tmp;  
}  
}  
System.out.print(arr[i]+" ");  
}  
}  
}  