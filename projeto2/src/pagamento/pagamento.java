package pagamento;
import java.util.Scanner;
public class pagamento {

	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);
		
		int opcao, numPar;
		double TotalG=0;
		
		System.out.println("Insira o total gasto");
		TotalG = ler.nextDouble();
		
		while(TotalG != -1) {
			
			
			System.out.println("Selecione uma das opções de pagamento: ");
			System.out.println("1- À Vista: com 10% de desconto");
			System.out.println("2- Parcelado 2x");
			System.out.println("3- Parcelado de 3x até 6x com 3% de juros ao mês (somente para compras acima de R$ 500,00");
			
			opcao = ler.nextInt();
			
			switch(opcao) {
			
			case 1:
				System.out.println("Valor total a vista: R$" + TotalG * 0.9);
				break;
			
			
			case 2:
				System.out.println("Valor total parcelado: R$ " + TotalG + ", em duas parcelas de: R$ " + TotalG/2);
				break;
				
			case 3:
				{
										
					if(TotalG>=500) 
					{
						System.out.println("Insira o número de parcelas");
						numPar = ler.nextInt();
						
						if(numPar>= 3 & numPar<=6) 
							{
								System.out.printf("Valor total parcelado: %.2f, em %d parcelas de: R$ %.2f \n" , TotalG * 1.03 ,  numPar , (TotalG * 1.03)/numPar);							
							}
						else 
						{
							System.out.println("Número de parcelas inválido");
						}
						
					}
										
					else 
					{
						System.out.println("Escolha nova forma de pagamento");									
					}
						break;
				}
				
			default : System.out.println("Opção inválida");
			
			}
		
			System.out.println("\nInsira o total gasto");
			TotalG = ler.nextDouble();
		}

	}

}