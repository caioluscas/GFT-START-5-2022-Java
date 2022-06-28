
public class Trabalhador {
	String nome;
	double salariohr;
	int hrtrabalhada;
	
	public Trabalhador(String nome, double salariohr, int hrtrabalhada) {
		super();
		this.nome = nome;
		this.salariohr = salariohr;
		this.hrtrabalhada = hrtrabalhada;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalariohr() {
		return salariohr;
	}
	public void setSalariohr(double salariohr) {
		this.salariohr = salariohr;
	}
	public int getHrtrabalhada() {
		return hrtrabalhada;
	}
	public void setHrtrabalhada(int hrtrabalhada) {
		this.hrtrabalhada = hrtrabalhada;
	}
	
	public double getSalarioTotal() {
		return hrtrabalhada*salariohr;
		
	}
	
	public void mostra() {
		System.out.println();
		System.out.print(getNome()+" ");
		System.out.print(getSalariohr());
		System.out.println(" "+getHrtrabalhada());
		
	}
	
	

}
