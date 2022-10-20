
public class testeDeReferencia {
	public static void main(String[] args) {
		conta contaLeonardo = new conta();
		contaLeonardo.titular = new Cliente();
		contaLeonardo.titular.nome = "Leonardo Scapin";
		contaLeonardo.agencia = 1211;
		
		
	}
}
