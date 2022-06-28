import java.util.Scanner;

public class Questao_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int matriz[][];

        
        int l=0, c =0;

        System.out.println("Digite a quantidade de linhas da matriz");
        l = scan.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz");
        c = scan.nextInt();
        
        matriz = new int[l][c];
        for(int i=0; i<c; i++) {
        	for(int j=0; j<l; j++) {
        		System.out.print("matriz{"+i+"} {"+j+"}");
        		matriz[i][j] = scan.nextInt();
        		System.out.println();
        	}
        }
		
		

	}

}
