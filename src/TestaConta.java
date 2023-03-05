
public class TestaConta {
	
	public static void main(String[] args) {

		Conta contaDoFabio = new Conta();
		contaDoFabio.titular = new Cliente();
		contaDoFabio.titular.nome = "Fabio";
		
		System.out.println("O nome do cliente é " + contaDoFabio.titular.nome);
		
		contaDoFabio.titular.cpf = "111.111.111-11";
		System.out.println("O seu cpf é " + contaDoFabio.titular.cpf);

		contaDoFabio.titular.profissao = "Analista de Sistema";
		System.out.println("E sua profissão é " + contaDoFabio.titular.profissao);
		
	
	}


}
