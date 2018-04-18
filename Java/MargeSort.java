import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MargeSort {
	
	public static int [] mergesort (int [] a  )
	{
		int n = a.length;
		if (n == 1) 
		return a;
		else
		{
			
			int mid = n/2;
			int left_subarray [] = new int [mid]; 
			int right_subarray [] = new int [n - mid];
			System.arraycopy(a, 0 , left_subarray, 0 , left_subarray.length);
			System.arraycopy(a, left_subarray.length , right_subarray , 0 , right_subarray.length);
			mergesort(left_subarray);
			mergesort(right_subarray);
			merge(left_subarray , right_subarray, a);
		    return a;
		}
		
		
	}
	
	public static void merge (int [] a, int [] b , int [] c)
	{
		int left = a.length;
		int right = b.length;
		int indexa = 0 , indexb = 0 , indexc = 0;
		
		while (indexa < left && indexb < right )
		{
			if (a [indexa] < b[indexb])
			{
				c[indexc]= a [indexa];
				indexa ++;
			}else {
				 c[indexc]= b[indexb];
			     indexb++;
		         
			}
			indexc ++;     		
		}
		
		while (indexa < left) 
		{
			c[indexc] = a[indexa];
			indexa++;
			indexc++;
		}
		
		while (indexb < right) 
		{
			c[indexc] = b[indexb];
			indexb++;
			indexc++;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter  (System.out));
		  
	    bw.write("Ingrese Numeros Separados por comas (,) : ");
		bw.flush();
		String l = br.readLine();
		  
		String A []= l.split(",");
		int [] entradaArreglo = new int [A.length];
		
		for (int i = 0 ; i < A.length ; i++) 
	      {
	    	  entradaArreglo[i] = Integer.parseInt(A[i]);
	      }
		
		int[] is = MargeSort.mergesort(entradaArreglo);
		int [] sorteoArray = is;
		for ( int i = 0 ; i < sorteoArray.length ; i++)
		
			bw.write(" " + sorteoArray[i] + " ");
			bw.flush();
		

	}

}
