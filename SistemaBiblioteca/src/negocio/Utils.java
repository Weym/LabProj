import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Utils {
	String cpf;

	public static boolean isCpf(String valor) {
		boolean retorno = valor.matches("\\d{11}");

		if (retorno == false) {

			System.out.println("Formato do CPF inválido, informe apenas números e 11 digitos.");
		}
		return retorno;
	}
	
	public static boolean isCEP(String valor){
		boolean retorno = valor.matches("\\d{8}");
		
		if (retorno == false){
			System.out.println("Formato do CEP inválido, informe apenas números e 8 dígitos.");
		}
		return retorno;
	}
	
	public static String formatarCEP(String cep){
		if (isCEP(cep)){
			String c1 = cep.substring(0, 5);
			String c2 = cep.substring(5, 8);
			
			cep = String.format("%s-%s", c1, c2);
			return cep;
		}
		
		else{
			return null;
		}
	}
	
	public static String formatarCPF(String cpf){
		if (isCpf(cpf)){
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

	public Utils(int cep) {
	}
}
