
public class testeReferencia {
	public static void main(String[] args) {
		
	
	conta primeiraConta = new conta();
	primeiraConta.saldo = 6700;
	conta outraConta = primeiraConta;
	outraConta.saldo+= 4700;
	System.out.println("a primeira conta tem saldo de "+ primeiraConta.saldo + " e a outra conta" + outraConta.saldo);
	// as variaveis s�o refer�ncias aos objetos. Por isso, s�o como diferentes cartas endere�adas ao mesmo lugar. variavel n�o guarda objeto, mas sim um caminho
	System.out.println(outraConta);
	}
}