package questao1;

public class Main {

	public static void main(String[] args) {
		
		char[][] tabela = new char[10][10];
		
//		Padr�o 1
		System.out.println("Padr�o 1: ");
		for(int x=0;x<10;x++) {
			for(int y=0;y<10;y++) {
				if(x>=y) {
					tabela[x][y]='*';
					System.out.printf("%c ",tabela[x][y]);
				}			
			}
			System.out.printf("\n");
		}	
		
		//Padr�o 2
		System.out.println("\nPadr�o 2: ");
		for(int x=0;x<10;x++) {
			for(int y=0;y<10;y++) {
				if(x<=y) {
					tabela[x][y]='*';
					System.out.printf("%c ",tabela[x][y]);
				}			
			}
			System.out.printf("\n");
		}
		
		//Padr�o 3
		System.out.println("\nPadr�o 3: ");
		for(int x=0;x<10;x++) {
			for(int y=0;y<10;y++) {
				if(x>=y+1) {
					tabela[x][y]=' ';
				}		
				else
					tabela[x][y]='*';
				System.out.printf("%c ",tabela[x][y]);
			}
			System.out.printf("\n");
		}	
			
		//Padr�o 4
		System.out.println("Padr�o 4: ");
		
		for(int x=10;x>0;x--) {
			for(int y=0;y<10;y++) {
				if(x>y+1) {
					tabela[x-1][y]=' ';										
				}	
				else 
					tabela[x-1][y]='*';
				System.out.printf("%c ",tabela[x-1][y]);
					
			}
			System.out.printf("\n");
		}
	}

}
