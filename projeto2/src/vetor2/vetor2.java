package vetor2;
import java.util.Scanner;
import java.util.Random;
public class vetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		
		int opcao, numPoltrona;
		int [] poltrona = new int[100];
		int i=0;
		String nome, dtaVoo, horario, cpf;
		
				
		do{
			System.out.println("1- Cadastrar passageiro \n2- Check in \n3- Cancelar Voo \n4- Sair");
		  	opcao = ler.nextInt();
      
      		switch(opcao) 
      		{
				case 1:
					System.out.println("Insira seu nome");
					nome = ler.next();
					System.out.println("Insira seu CPF");
					cpf = ler.next();
					
					ler = new Scanner(System.in);
					
					System.out.println("Insira a data do voo");
					dtaVoo = ler.next();
					System.out.println("Insira o horario");
					horario = ler.next();
					
					System.out.println("Cadastro Efetuado com Sucesso!");
					
					int numVoo = random.nextInt(999);
					
					System.out.println("O número do seu voo é: " + numVoo);
					System.out.println();
					break;
					
				case 2:
					System.out.println("Insira seu CPF");
					cpf = ler.next();
					System.out.println("Insira o número do voo");
					numVoo = ler.nextInt();
					
					System.out.println("Insira o número da poltrona");
					numPoltrona = ler.nextInt();
					
					i = numPoltrona;
										
					if(poltrona[i] != 0)
					{
						System.out.println("Poltrona já ocupada \n");
					}
					
					else 
					{
						System.out.println("Check in realizado com sucesso! \n");
						poltrona[i]=i;
					}
						break;
					
				case 3:
					System.out.println("Insira seu CPF");
					cpf = ler.next();
					System.out.println("Insira o número do voo");
					numVoo = ler.nextInt();
					System.out.println("Insira o número da poltrona");
					numPoltrona = ler.nextInt();
					
					i = numPoltrona;
					
					poltrona[i] = 0;
					
					System.out.println("Voo " + numVoo + " cancelado para o CPF " + cpf);
					System.out.println();
					break;
				
				case 4:
					break;
					
			}
		}
		
		while(opcao!=4);
	}

}