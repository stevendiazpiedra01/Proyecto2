import java.io.*;

public class LinealSearch {
	
	static int linealsearch (int [] a , int dato)
	{
		int index = -1;
		for (int i = 0 ; i < a.length ; i ++)
		{
			if (a[i]== dato)
			{
			index = i;
			break;
			}
		}
		return index;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	  BufferedWriter bw = new BufferedWriter (new OutputStreamWriter  (System.out));
	  
	  bw.write("Ingrese Numeros Separados por comas (,) : ");
	  bw.flush();
	  String l = br.readLine();
	  
	  String A []= l.split(","); 
      int a [] = new int [A.length];
      
      for (int i = 0 ; i < A.length ; i++) 
      {
    	  a[i] = Integer.parseInt(A[i]);
      }
	  
      bw.write("Ingrese Numero :");
	  bw.flush();
	  int dato = Integer.parseInt(br.readLine()); 
	  System.out.println(dato + " se encuentra en el indice : " + linealsearch(a,dato));
            
	}

}
