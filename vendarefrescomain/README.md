# Desafio 30 dias de CSS

## Objetivo

Exercícios da Disciplina Desenvolvimento de Sistemas I, do Curso Técnico de Desenvolvimento de Sistemas, SENAI Bahia. A disciplina tem como objetivo a introdução dos conceitos de Programação Orientada a Objetos (POO), utilizando a linguagem de programação JAVA.

## Exercício

Aplicação dos conceitos de relacionamento entre classes.

Classe Refresco

* Atributos privados: precoUnitario (double), sabor (String), tamanho (char), contemAcucar (boolean), fabricante (Fabricante).
* Atributo público, estático e final: sabores (String[]). Esse vetor contém três sabores: Tamarindo (posição 0), Limão (posição 1), Groselha (posição 2).
* Parâmetros do construtor: sabor, tamanho, contemAcucar, fabricante. Dentro do construtor, os 4 respectivos atributos são inicializados, e o método setPrecoUnitario() é chamado.
* Método setPrecoUnitario(): é privado e não retorna nada. Possui inicialmente o valor base de 2.5. Se o tamanho do refresco for G, aumenta o valor base em 1.0. Se o tamanho do refresco for M, aumenta o valor base em 0.50. Se o refresco tiver açúcar, aumenta o valor base em 0.50. Por fim, o valor calculado é atribuído a precoUnitario.
* Método getter de precoUnitario. Retorna o atributo de mesmo nome.
* Método getInfoRefresco(). Retorna uma String com as informações do refresco: sabor, tamanho, se contém açúcar, o preço e fabricante. Os dados do fabricante devem ser obtidos de getInfoFabricante().

 
Classe Fabricante

* Atributos privados: nome (String), CEO (String), anoFundacao (int).
* Parâmetros do construtor: os três atributos acima. Dentro do construtor, os três atributos são inicializados.
* Método getInfoFabricante(). Retorna uma String com as informações do fabricante: nome, ano de fundação e CEO atual.

 
Classe Venda

* Atributos privados: precoFinal (double), itens (ArrayList de Refresco).
* Construtor: não tem parâmetro nenhum. Dentro do construtor, o preço final é inicializado com 0.0, e um novo objeto ArrayList é instanciado para itens.
* Método adicionarItem(). Não retorna nada. Recebe um Refresco como parâmetro e o adiciona na lista de itens. Atualiza o atributo preço final, somando o que já tem com o valor do preço desse Refresco recebido por parâmetro.
* Método getter de precoFinal. Retorna o atributo de mesmo nome.
* Método getItens(). Retorna uma String com as informações de todos os refrescos que estão na lista de itens. Uma opção para implementar isso é: criar uma String inicialmente vazia; usar um for para percorrer todos os itens; concatenar os dados de cada Refresco com a String; retornar a String. Os dados de cada refresco devem ser obtidos de getInfoRefresco().

Classe VendaRefrescoMain

* Essa classe já está disponível com o código. No entanto, você pode ganhar alguns décimos extras caso crie sua própria Main, montando um menu no qual o usuário pode cadastrar um fabricante, comprar quantos refrescos quiser, escolhendo tamanho, sabor (Tamarindo, Limão ou Groselha), se contém açúcar. E no final o programa exiba um extrato com os itens comprados e o preço final da venda.

## Tecnologias usadas

*   Java; 
*   JDK 8; 
