package negocio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Utils {
	
	public static String validarCpf(String cpf) {
		if (cpf==null || cpf.equalsIgnoreCase("")|| cpf.equalsIgnoreCase("(null)") || cpf.equalsIgnoreCase("null")) 
 {
			return "CPF Inválido.";
		} else {
			String NumCPF = "";
			for (int i = 0; i < cpf.length(); i++) {
				if (Character.isDigit(cpf.charAt(i)))
					NumCPF = NumCPF + cpf.substring(i, i + 1);
			}
			if (NumCPF.length() > 11 || NumCPF.length() < 6) {
				return "CPF Inválido";
			}
			while (NumCPF.length() < 11) {
				NumCPF = "0" + NumCPF;
			}
			int soma = 0, primDig = 0, segDig = 0;
			String compara = NumCPF;
			String A = NumCPF.substring(0, 3);
			String B = NumCPF.substring(3, 6);
			String C = NumCPF.substring(6, 9);
			String D = NumCPF.substring(9, 11);
			for (int i = 1; i <= 9; i++) {
				soma += i * Integer.parseInt(NumCPF.substring(i - 1, i));
			}
			primDig = (soma % 11);
			if (primDig >= 10) {
				primDig = 0;
			}
			NumCPF = NumCPF.substring(0, 9) + String.valueOf(primDig);
			for (int j = 1; j <= 9; j++) {
				soma += j * Integer.parseInt(NumCPF.substring(j - 1, j + 1));
			}
			segDig = (soma % 11);
			if (segDig >= 10) {
				segDig = 0;
			}
			NumCPF = NumCPF + String.valueOf(segDig);
			if (compara.equalsIgnoreCase(NumCPF)) {
				return A + "." + B + "." + C + "-" + D;
			}
			return "Digito Verificador da base é Inválido";
		}
	}
	
	   public static void salvar(Object objeto, String caminho) {
		   
           try {
             FileOutputStream saveFile = new FileOutputStream(caminho);
             ObjectOutputStream stream = new ObjectOutputStream(saveFile);
 
              // salva o objeto
             stream.writeObject(objeto);
 
             stream.close();
           } catch (Exception exc) {
             exc.printStackTrace();
           }
    }
	   
       public static Object restaurar(String caminho) {
    	   
           Object objeto = null;
          
           try {
                  FileInputStream restFile = new FileInputStream(caminho);
                  ObjectInputStream stream = new ObjectInputStream(restFile);

                  // recupera o objeto
                  objeto = stream.readObject();

                  stream.close();
           } catch (Exception e) {
                  e.printStackTrace();
           }

           return objeto;
    }
}
