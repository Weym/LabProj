package negocio;

public class Utils {
	
	public static boolean validarCpf(String valor) {
		boolean retorno = valor.matches("\\d{11}");

		if (retorno == false) {

			System.out.println("Formato do CPF inválido, informe apenas números e 11 digitos.");
		}
		return retorno;
	}
	
	public static boolean validarTelefone(String telefone) {
		boolean retorno = telefone.matches("\\d{8}");

		if (retorno == false) {

			System.out.println("Formato do telefone inválido, informe apenas números e 8 digitos.");
		}
		return retorno;
	}
	
	public static String formatarTelefone(String telefone){
		if (validarTelefone(telefone)){
			String ddd = "81";
			String c1 = telefone.substring(0, 4);
			String c2 = telefone.substring(4, 8);
			telefone = String.format("(%s) %s-%s", ddd, c1, c2);
			return telefone;
		}
		else{
			return null;
		}
	}
	
	public static String formatarCPF(String cpf){
		if (validarCpf(cpf)){
		String c1 = cpf.substring(0, 3);
		String c2 = cpf.substring(3, 6);
		String c3 = cpf.substring(6, 9);
		String c4 = cpf.substring(9, 11);
		cpf = String.format("%s.%s.%s-%s", c1, c2, c3, c4);
		return cpf;
	}
		else{
			return null;
		}
	}
	
}
