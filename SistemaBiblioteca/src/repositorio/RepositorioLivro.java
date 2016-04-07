package repositorio;

import java.util.ArrayList;
import java.util.List;

import entidades.Livro;

public class RepositorioLivro {

	List<Livro> listaLivros = new ArrayList<Livro>();

	public boolean salvaLivro(Livro livro) {

		try {

			listaLivros.add(livro);

		} catch (Exception e) {
			return false;
		}

		return true;
	}
/*
	public boolean deletarPessoaPorID(long id) {

		for (Livro livro : listaLivros) {
			if (livro.getId() == id) {
				listaLivros.remove(livro);
			}
		}

		return false;
	}

	public List<Livro> listarPessoa() {
		// TODO Auto-generated method stub
		return this.listaLivro;
	}

	public boolean alteraLivro(Livro livro) {

		for (Livro livro1 : listaLivros) {
			if (livro1.getId() == livro.getId()) {
				
				listaLivros.remove(livro1);
				listaLivros.add(livro);
				
			}
		}

		return false;
	}
*/
}
