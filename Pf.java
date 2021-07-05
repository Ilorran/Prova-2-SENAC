//Avalia��o final.
//Nomes: Iorran Gabrieli.
//Mat�ria: BSI
package pf;
import java.util.Scanner;
import java.util.Arrays;

public class Pf {

	public static void main(String[] args) {
		
		System.out.print("N�O REPITA NOMES\n1 - Adicionar nomes. \n2 - Apresentar nomes. \n3 - Pesquisar nomes. \n4 - Remover nomes.\n" +
				"Digite: ");
		Scanner teclado = new Scanner(System.in);
		String [] nomes = new String [5]; //declara��o vetor
		String[] nom = new String[nomes.length - 1];//c�p vetor excl
		int dec;
		int count = 0;


	
			
							do {
							switch(dec = teclado.nextInt()) {
			 case 1:
							for(int i = nomes.length-1; i >= 0; i--){
							System.out.print("Digite o nome para a posi��o " + i + " do vetor: "); // adi��o de nomes
							nomes[i] = teclado.next();							 
							for (int j = i + 1 ; j < nomes.length; j++) {
						    if (nomes[i].equals(nomes[j])) {
						    System.out.print("Repetiu, reinicie o programa AGORA!!!"); //sai do programa imediatamente caso repita
						    System.exit(0);
						    }
							}
							}
							System.out.print("\n1 - Adicionar nomes. \n2 - Apresentar nomes. \n3 - Pesquisar nomes. \n4 - Remover nomes.\n" +
							"Digite: ");
							break;
			 case 2:
					
							if (nomes.length == nomes.length) {
							for(int i = 0; i <nomes.length; i++){
						    System.out.println("Posi��o " + i + " :" + nomes[i]);
						    }
							}
							System.out.print("____________________________________________\n");
							if (dec == 2) {
							String[]nom1 = new String[nom.length];
							for(int i = 0; i <nom1.length; i++){
							System.out.println("Ap�s exclus�o / posi��o " + i + " :" + nom[i]);
							}
							}	
							else 
							System.out.print("Lista incompleta, preencha tudo.");
							System.out.print("\n1 - Adicionar nomes. \n2 - Apresentar nomes. \n3 - Pesquisar nomes. \n4 - Remover nomes.\n" +
							"Digite: ");
							break;
			 case 3:
			
							System.out.print("Digite o nome que quer pesquisar: ");
							String bf2 = teclado.nextLine();
							String search = teclado.nextLine();
							boolean isTru = false;
							for (int l1 = 0;l1 < nomes.length; l1++) {
							if(nomes[l1].equals(search)) {
							isTru = true;
							System.out.println("Nome encontrado no indice " + l1);
							break;
							}
							}
							if(!isTru) {
							System.out.println("Nome n�o encontrado.");
							}
							System.out.print("\n1 - Adicionar nomes. \n2 - Apresentar nomes. \n3 - Pesquisar nomes. \n4 - Remover nomes.\n" +
							"Digite: ");
							break;
			 case 4:
				 			System.out.print("Digite um nome para ser removido: ");
				 			char deci;
				 			String bf1= teclado.nextLine();
				 			String rmv = teclado.nextLine();
				 			boolean istru = false;
				 			for (int i = 0; i < nomes.length; i++){
				 			if(nomes[i].equals(rmv)) {
				 			isTru = true;
				 			System.out.print("NOME ENCONTRADO NO �NDICE " + i + "\nDESEJA REMOVER? \n'S' para SIM\n'N' para N�O\nDigite:");
				 			deci = teclado.nextLine().charAt(0);
				 			if(deci == 's') {
				 			System.out.print("Digite o �ndice informado logo acima: ");
				 			int ind = teclado.nextInt();
				 			for (int i1 = 0, k = 0; i1 < nomes.length; i1++) { 
				 	        if (i1 == ind) { 
				 	        continue; 
				 	        }
				 	        nom[k++] = nomes[i1]; 
				 	        } 
				 			System.out.println("Array ap�s remo��o: " + Arrays.toString(nom));
				 			}
				 			else if (deci == 'n') {
				 			break;
				 			}
				 			}
				 			}
				 			System.out.print("\n1 - Adicionar nomes. \n2 - Apresentar nomes. \n3 - Pesquisar nomes. \n4 - Remover nomes.\n" +
							"Digite: ");
				 			break;
			 				default: System.out.print("op��o inv�lida");
		
									}	
		
  }while (dec != 0);
 }

}

