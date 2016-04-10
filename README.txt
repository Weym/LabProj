Prioridades:
1 - Retornar informações individuais dos arvquivos (getTitulo, sasporra, e sim, to apanhando com isso)

2 - Sistema de empréstimo básico:
	- O usuário pega um livro, isso diminui 1 da quantidade de exemplares, blabla.

	
^ com isso aí já tem algo apresentável.

Dos requisitos, tem feito:
	- CRUD, uma funcionalidade além do CRUD (Listar, buscar);
	- Menu interativo;
	- Encapsulamento
	- Construtores
	- Organizado em pacotes
	- Fácil de fazer:
		- Documentação
	- Falta:
		- Quatro entidades (falta uma, que era pra ser de biblioteca com o sistema de empréstimo e pa)
		- Duas validações de regras de negócio (pra fazer essa precisa do primeiro bagulho das prioridades)
	- Ponto total com isso aí: 6x7 = 4.2
	- +1.5 da definição das classes, atributos e métodos
	- 1.5 vem de modularização/organização do codigo


Eu tô terminando o CRUD do Cliente, o do autor precisa do primeiro bagulho lá tbm :p




-----------------------------------------------
-----------------------------------------------




//essa merda zuo a formatação do bloco de notas 
OBS:
- O que caralho fica no pacote de negócios? as "regras dos negócios" tá.. dafuq é isso? os bagulhos de emprestar e tal?
tem que mudar os diretórios dos arquivos na classe DadosLivro
- O cadastro do livro não tá completo.. deixei sem o ano de publicação, categoria e editora.. sepa colocar isso depois, mas n tem pq, a apresentação não é pra criar um programa 100% fiel anyway

(Depois de terminar tudo) Checar o repositório, acho que tem algo desnecessário lá.
Cadastro de Clientes
Fazer o empréstimo dos livros
	- Quando o livro tiver sido empreste a alguém, 1 unidade vai ser removida dos exemplares
	- Fazer o prazo, atraso, etc

Cadastro de autores 
- Como fazer o cadastro de autores? Do jeito que tá.. o livro tá sendo criado pegando Autor como String, fiz assim pq só tava terminando a parte do livro, sem conectar tudo
- E a criação dos arquivos tá individual (pra cada livro cadastrado, cria-se um arquivo)
- Possiveis problemas de quando criar o autor:
- 	Ele vai listar os livros? (se ele tiver escrito mais de 1)
- 	Se cadastrar o autor quando tiver criando o livro.. e tentar cadastrar em outro, vai bugar
- 	é só "food for thought", se for fazer, faz do jeito que tu achar certo ae


Problemas a resolver:
- Quando tenta salvar o arquivo sem a pastar estar criada, dá erro.
- Mudar os diretórios da manipulação dos arquivos, organizar em pastas dentro da WorkPlace, mas sem ter que ficar escrevendo o caminho todo "C://etc", pq quando mudar o projeto de pc não precisa ficar modificando isso
- Quando sai do módulo, ele "trava", não retorna ao menu principal.. provavelmente é usando Switch Case no main pra resolver isso, ao invés do do while (saporra faz depois que terminar tudo, não é requisito)



# LabProj
Projeto do desenvolvimento de um sistema de biblioteca.
