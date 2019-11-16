package com.numerosimparesreverse.app;

public class NumerosImparesReverse {

	public static void main(String[] args) 
	{
		int cont=0;
		for(int i=100;i>=1;i--)
		{
			if(i%2==1)
			{
				System.out.println(i);
				cont=cont+i;
			}
		}
		System.out.println("La SUMA de los impares es: "+cont);

	}

}
