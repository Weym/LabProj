package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Livro;

public class RepositorioLivro {

	List<Livro> listaLivros = new ArrayList<Livro>();

	public boolean salvarLivro(Livro livro) {

		try {

			listaLivros.add(livro);

		} catch (Exception e) {
			return false;
		}

		return true;
	}

}
