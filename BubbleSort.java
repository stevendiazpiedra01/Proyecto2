import java.io.*;
public class BubbleSort 
{
    static void BubbleSort1 ( int [] array )
	{
		for ( int i = 0 ; i < array.length - 1 ; i ++ )
		{
			boolean swapped = false;
			for ( int j = 0 ; j < array.length - 1 ; j++ )
			{
				if (array[j] > array[j + 1])
				{
					int swap = array [j];
					array [j] = array [j + 1];
					array [j + 1] = swap;
					swapped = true;
				}
			}
			
			if (swapped == false) 
				break;
		}
	}
	
	static void imprimirArreglo ( int array[] , int tam)
	{
		for (int i = 0 ; i < tam; i++)
		
			System.out.print(array[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {

		   BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		   
		   bw.write("Ingrese Numeros Separados por comas (,) : ");
		   bw.flush();
		   String l = br.readLine();
		   
		   String arrays [] = l.split(",");
		   int array [] = new int [arrays.length];
		   for ( int i = 0; i<arrays.length; i ++)
		   {
			   array[i] = Integer.parseInt(arrays[i]);
		   }
		   
		   int arrayl = array.length;
		   BubbleSort1 (array);
		   System.out.println("Sorteo arreglo :");
		   imprimirArreglo(array,arrayl);
		    
        } 
    

}

