package linketinder.teste
import linketinder.Main
import org.junit.Test
import static org.junit.Assert.assertEquals

    @Test
    void comparaCandidatoInseridoComCandidatoNaLista(){
    //Arrange
    Main candidato = new Main()
    def listaDeCandidatos
    listaDeCandidatos.add(candidato)

    //Act
    if (candidato){
        println "Candidato Inserido"
    }else if (candidato == 0 ){
        "Nenhum Candidato"
    }

    //Assert
    assertEquals(candidato, listaDeCandidatos)
    //Verificar se a lista de candidatos e igual a listagem de candidatos
    assertEquals(listaDeCandidatos + 1,listaDeCandidatos.size())
}

@Test
void comparaEmpresaInseridaComEmpresaNaLista(){
    //Arrange
    Main empresa = new Main()
    def listaDeEmpresas
    listaDeEmpresas.add(empresa)

    //Act
    if (empresa){
        println "Empresa Inserida"
    }else if (empresa == 0 ){
        "Nenhuma Empresa"
    }

    //Assert
    assertEquals(empresa, listaDeEmpresas)
    //Verificar se a lista de candidatos e igual a listagem de candidatos
    assertEquals(listaDeEmpresas + 1,listaDeEmpresas.size())
}


