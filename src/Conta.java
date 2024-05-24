
public class Conta {
	
	//atributos e seus encapsulamentos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//construtor pedido no exercício
	public Conta(float saldo, boolean status) {
		this.saldo = 0;
		this.status = false;
	}

	//métodos especiais getters e setters
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numCont) {
		this.numConta = numCont;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tp) {
		this.tipo = tp;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dn) {
		this.dono = dn;
	}

	public float getSaldo() {
		return saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean stts) {
		this.status = stts;
	}
	
	//métodos pedidos no exercício
	//método para abrir uma conta
	public void abrirConta(String tipo, boolean status) {
		this.tipo = tipo;
		if (tipo.equals("cc")) {
			this.saldo = 50;
			setStatus(true);
			System.out.println("Conta-corrente aberta com sucesso!");
		} else {
			this.saldo = 150;
			setStatus(true);
			System.out.println("Conta poupança aberta com sucesso!");
		}
	}
	
	//método para fechar uma conta aberta
	public void fecharConta(boolean status, float saldo) {
		if (status == true) {
			if (this.getSaldo() != 0) {
				System.out.println("A conta não pode ser encerrada, pois o saldo não está zerado");
			} else {
				status = false;
				System.out.println("Conta encerrada com sucesso!");
			}
		}
	}	
		//método para depositar (acrescentar valor ao saldo)
		public void depositar(boolean status, float valor) {
			if (status == true) {
				this.saldo += valor;
				System.out.println("Valor depositado com sucesso, na conta de " + getDono());
			} else {
				System.out.println("O valor não pode ser depositado, pois a conta não está aberta");
			}
		}
		
		//método para sacar (retirar valor do saldo)
		public void sacar(boolean status, float valor) {
			if (status == true) {
				if (this.saldo >= valor) {
					this.saldo -= valor;
					System.out.println("Saque realizado com sucesso na conta de " + getDono());
				} else {
					System.out.println("Não é possível realizar o saque, pois o saldo é insuficiente.");
				}
			} else {
				System.out.println("Não é possível realizar o saque, pois a conta não está aberta");
			}
		}
		
		//método para pagar a mensalidade da conta
		public void pagarMens(String tipo) {
			this.tipo = tipo;
			if (tipo.equals("cc")) {
				if (this.saldo >= 12) {
					this.saldo -= 12;
					System.out.println("Mensalidade da conta-corrente paga com sucesso!");
				} else {	
					System.out.println("A mensalidade não pode ser paga, pois o saldo é insuficente.");
				} 
			}else {
				if ((tipo.equals("cp")) && this.saldo >=20) {
					this.saldo -= 20;
					System.out.println("Mensalidade da conta-poupança paga com sucesso!");
				} else {
					System.out.println("A mensalidade não pode ser paga, pois o saldo é insuficente.");
				}
			}
		}
		
		//método para verificar o estado (não pedido)
		public String consultaInfo() {
			return "Conta [numConta=" + this.getNumConta() + ", tipo=" + this.getTipo() + ", dono=" + this.getDono() + ", saldo=" + this.getSaldo()
					+ ", status=" + this.getStatus() + "]";
		}
}
	
