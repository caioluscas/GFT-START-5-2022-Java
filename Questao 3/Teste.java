import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabalhador trab = new Trabalhador("Caio", 15, 1);
		trab.mostra();
		Trabalhador trab1 = new Trabalhador("Rafaela", 12, 1);
		trab1.mostra();
		Trabalhador trab11 = new Trabalhador("Roberto", 6, 1);
		trab11.mostra();
		Trabalhador trab111 = new Trabalhador("Regina", 5, 1);
		trab111.mostra();
		Trabalhador trab1111 = new Trabalhador("Matias", 20, 1);
		trab1111.mostra();
		
		String n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o trabalhador você deseja ver? ");
		n = scan.next();
		
		/*if(n==trab) {
			trab.mostra();
		}else if(n==trab1) {
			trab1.mostra();
		}else if(n==trab111) {
			trab111.mostra();
		}else {
			trab1111.mostra();
		}*/

	}

}
