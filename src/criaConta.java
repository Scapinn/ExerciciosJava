
public class criaConta {
public static void main(String[] args) {
	conta primeiraConta = new conta ();
	 primeiraConta.saldo= 5600;
	System.out.println(primeiraConta.saldo);
	conta segundaConta = new conta ();
	segundaConta.saldo = 8500;
	System.out.println(segundaConta);
	
	segundaConta.deposita(2500);
	System.out.println(segundaConta.saldo);
	segundaConta.saca(2000);
	System.out.println(segundaConta.saldo);
	segundaConta.transferencia(3000, primeiraConta);
	System.out.println(primeiraConta.saldo);

}
}
