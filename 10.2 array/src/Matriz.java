
public class Matriz {

	// Vetores e Matrizes em java (Array)

	// Declara o Array e determina a quantidade de posições da variavél:
	private int valor1[] = new int[5]; //pode ir até 5 posições: 0,1,2,3,4

	private int valor2[] = new int[5];//Declarado, porém sem valor

	private int valor3[] = {5, 3};//está dizendo que este array foi declarado com 3 posições, colocamos valor nas primeiras 2, (0 = 3, 1 = 3)
			
	public void adicionarValor() {
		
		//Preenche o Array:
		valor1[0] = 5; //valor 1 na posição 0 recebe 5
		valor1[3] = 8; // valor 1 na posição 3 recebe 8
		//valor1[5] = 7; FORA DO RANGE (LIMITE/ESCOPO)
		
		System.out.println("Array valor1: "
				+ valor1[0] + ", "
				+ valor1[1] + ", "
				+ valor1[2] + ", "
				+ valor1[3] + ", "
				+ valor1[4]);
		
		System.out.println("Array valor3: "
				+ valor1[0] + ", "
				+ valor1[1]);
		
		//irá contar de 1 até 100:
		int valor4[] = new int[100];// adicionamos 100 casas
		
		for (int cont = 0; cont < 100; cont++) {// mudei de i para cont, porém é bom lembrar que o i é muito utilizado
			
			valor4[cont] = cont + 1;// começa no 1 e não mais no 0, por isso o +1
			
			System.out.println(valor4[cont] + "\n");
		}
		
		/*System.out.println(valor3[0]);//5 e 3 
		System.out.println(valor3[1]);
		
		valor3[1] = 8;
		
		System.out.println(valor3[0]);//depois mudei para 5 e 8
		System.out.println(valor3[1]);*/
		
		//alor3[2] = 7;//agora o 2 passa a ser 7, antes era 6
	
		//e se eu mostrar um casa que não tem? só tem a 0 e 1
		//System.out.println(valor3[2]);
		
		
	}

}
