
public class conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	public void deposita (double  valor) {
		this.saldo += valor;
	}
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor; 
			return true; 
		} else {
			return false;
			}
		}
		public boolean imprime (double valor) {
			if(this.saldo >= 2000) {
				System.out.println("rico, nos de algo");
				saca(valor);
				return true;
			} else {
				return false;
			}

	    }
		public boolean transferencia(double valor, conta destino) {
			if(saca(valor)) {
				destino.deposita(valor);
				return true;
			} else {
				return false;
			}
		}
		
		}
		
		
		
		
		
	

