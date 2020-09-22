
package NB7;
import java.util.Arrays;


public class SortingAlgorithms {
    

public SortingAlgorithms()
{}
    public static int bubbleSort(int [] arrays)
    { 
        int temp = 0, i , j;
        for(i = 1; i < arrays.length - 1 ; i++)
            for( j = 0; j < arrays.length - i; j++){
       if(arrays[j] > arrays[j + 1])
           temp = arrays[j]; //1 5 3 6
           arrays[j] = arrays[j + 1];
           arrays[j+1] = temp;
            }
        return(arrays[i]);
    }
    
    public static int selectionSort(int [] arrays)
    {   int temp = 0, i = 0 , j = 0, min = 0;
        for( i = 1; i < arrays.length -1 ; i ++)
        {
            min = i;
        for( j = i + 1; j < arrays.length - 1; j++)
            if(arrays[j] < arrays[min])
            {
                min = j;
            }
        }
           temp = arrays[j]; 
           arrays[j] = arrays[min];
           arrays[min] = temp;
           
        return arrays[i];
    }
    
    public static int insertionSort(int [] arrays)
    {
        int i, key;
        int j = 0;
       for (i = 1; i < arrays.length - 1; i++) 
       {
        key = arrays[i]; 
        j = i - 1;
      
        while (j >= 0 && arrays[j] > key) {
        arrays[j + 1] = arrays[j];
        j = j - 1; }
        arrays[j + 1] = key;
      }
        return(arrays[i]);
    }
     public static int merge(int arrays[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i = 0; i < n1; ++i) 
            L[i] = arrays[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arrays[m + 1+ j]; 
 
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arrays[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arrays[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            arrays[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arrays[k] = R[j]; 
            j++; 
            k++; 
        }
        return(arrays[k]);
              
    } 
    public static int mergeSort(int arrays[], int l, int r) 
    { 
        if (l < r) 
        { 
            int m = (l+r)/2; 
            mergeSort(arrays, l, m); 
            mergeSort(arrays , 1 - m, r); 
            
           merge(arrays, l, m, r);  
        } 
        return(arrays[l+r]);
    } 
      public static int partition(int arrays[], int low, int high) 
    { 
        int pivot = arrays[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (arrays[j] < pivot) 
            { 
                i++; 
                int temp = arrays[i]; 
                arrays[i] = arrays[j]; 
                arrays[j] = temp; 
            } 
        } 
        int temp = arrays[i+1]; 
        arrays[i+1] = arrays[high]; 
        arrays[high] = temp; 
  
        return i+1; 
    } 
    public static int sortQuick(int arrays[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = partition(arrays, low, high); 
 
            sortQuick(arrays, low, pi-1); 
            sortQuick(arrays, pi+1, high); 
        } 
        return(arrays[low + high]);
    } 
     public static int javaSort(int [] arrays)
    { 
      Arrays.sort(arrays);
       return(arrays[0]); 
    }
public static int gnomeSort(int array[]) 
    { 
        int index = 0, n = 0;
      
        while (index < n) { 
            if (index == 0) 
                index++; 
            if (array[index] >= array[index - 1]) 
                index++; 
            else { 
                int temp = 0; 
                temp = array[index]; 
                array[index] = array[index - 1]; 
                array[index - 1] = temp; 
                index--; 
            } 
        } 
        return(array[index]);
    }  
}
