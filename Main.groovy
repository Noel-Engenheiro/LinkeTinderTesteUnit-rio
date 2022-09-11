package linketinder

//fazer uma lista de competências
//Dados dos Candidatos
//String competencias
//Strings e inteiros dos candidatos
//given, when, then
//chamar os métodos void povoarListaDeEmpresa e de povoarListaDeEmpresaCandidatos


		int opcao = 0

		Scanner sc = new Scanner(System.in)
		List<Candidato> listaDeCandidatos = new ArrayList<>()
		List<Empresa> listaDeEmpresas = new ArrayList<>()

		while (opcao != 5) {
			System.out.println("\nEscolha a opção do Menu\n\n" + "1 Criar Candidato\n" + "2 Listar Todos os candidatos\n"
					+ "3 Criar Empresa\n" + "4 Listar Todos as empresas\n")

			opcao = sc.nextInt()



	switch (opcao) {

		case 1: //adicionando candidatos

			Candidato candidato = new Candidato()

			System.out.println("Informe o nome do Candidato: ")
			String nome = sc.next()

			listaDeCandidatos.add(candidato)

			break

		case 2: //listar todos os candidatos

			System.out.println("Listando todos candidatos " +  listaDeCandidatos.size())

			for (Candidato candidato : listaDeCandidatos) {

				System.out.println("Tarefas"+ candidato)

				break
			}

		case 3: //adicionando candidatos

			Empresa empresa = new Empresa();

			System.out.println("Informe o nome da empresa: ")
			String nomedaempresa = sc.next()

			listaDeEmpresas.add(empresa)

			break

		case 4: //listar todos os candidatos

			System.out.println("Listando todas as empresas " +  listaDeEmpresas.size())

			for (Empresa empresa : listaDeEmpresas) {

				System.out.println("Tarefas"+ empresa)


				break
			}

	}

}