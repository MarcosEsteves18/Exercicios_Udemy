
public class Conta {
	private int numeroConta;
	private String nomeTitular;
	private double valorConta;
	private double tax = 5.00;
	
	
	public Conta() {}
	
	public Conta(int numeroConta, String nomeTitular, double valorInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.valorConta = valorInicial;
	}
	
	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public double getValorConta() {
		return valorConta;
	}
	public void setValorConta(double valor) {
		this.valorConta = valor;
	}
	
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double saque(double saque) {
		return this.valorConta = this.valorConta - saque - tax;
	}
	
	public double deposito(double deposito) {
		return  this.valorConta = this.valorConta + deposito;
	}
	
	public String toString() {
		return "Account " + this.numeroConta +", Holder: " + this.nomeTitular +", Balance: $"+ String.format("%.2f", this.valorConta);
	}
}


