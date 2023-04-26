package practica;

public class num_1_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Numeros divisibles entre 2 y 3 en el rango de 1-100:");
		for(int i =1; i<=100; i++ )
		{
			if(i%2==0 && i%3==0)
			{
               System.out.println(i);
			}
		}
	}

}
