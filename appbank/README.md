# Conta Banco - Parte 2

## Objetivo

Exercícios da Disciplina Desenvolvimento de Sistemas I, do Curso Técnico de Desenvolvimento de Sistemas, SENAI Bahia. A disciplina tem como objetivo a introdução dos conceitos de Programação Orientada a Objetos (POO), utilizando a linguagem de programação JAVA.

## Exercício

Aplicando os conceitos de Listas, este exercício é um aprimoramento do exercício `appmain` .

Para a classe ContaBanco:

* Remova os atributos de nome do banco e número da agência. Todas as referências a esses atributos também devem ser removidas. Eles também não devem constar no construtor.

Crie a classe Agencia (sem acento mesmo):

* Coloque os atributos privados numero (inteiro, sem acento também) e cidade (String). Numero deve ser wrapper.
* Coloque outro atributo privado, chamado listaContas. Essa lista de contas é um ArrayList de ContaBanco. Atenção: aqui você deve apenas declarar, mas sem instanciar a lista - ou seja, não precisa colocar = new ArrayList<>() - pois isso será feito dentro do construtor.
* Os parâmetros do construtor devem conter número e cidade.
* Dentro do construtor, além de atribuir os valores iniciais a numero e cidade, instancie listaContas - o que expliquei acima.
* Crie os getters de numero e cidade.
* Crie o método adicionarConta(), que recebe uma ContaBanco como parâmetro. Dentro do método, apenas chame add() de listaContas, passando a conta recebida como parâmetro.
* Crie o método listarContas(), que não tem parâmetros e retorna uma String. Dentro do método, crie uma String vazia inicialmente. Percorra a lista de contas com o for each, e vá concatenando à String as informações de cada conta percorrida. Ao final, retorne a string com as informações das contas. 

## Tecnologias usadas

*   Java; 
*   JDK 8; 
