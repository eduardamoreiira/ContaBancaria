
public class TestaConta {

	public static void main(String[] args) {
		
		 Conta c1 = new Conta(0, false);
		 c1.setNumConta(123);
		 c1.setDono("Eduarda Moreira");
		 c1.abrirConta("cc", true);
		 c1.depositar(true, 10);
		 System.out.println(c1.consultaInfo());
	}

}
