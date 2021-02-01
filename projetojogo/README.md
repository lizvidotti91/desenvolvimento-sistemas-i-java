# Projeto Jogo

## Objetivo

Exercícios da Disciplina Desenvolvimento de Sistemas I, do Curso Técnico de Desenvolvimento de Sistemas, SENAI Bahia. A disciplina tem como objetivo a introdução dos conceitos de Programação Orientada a Objetos (POO), utilizando a linguagem de programação JAVA.

## Exercício

Aplicação dos conceitos de polimorfismo.

**Classe Jogo**

* Possui os atributos protegidos: nome (String), precoUnitario (float), clasEtaria (int). Eles são inicializados no construtor.
* Sobrescreve o método toString(). O método retorna uma String com as informações de nome, preço e classificação etária do jogo.

**Classe JogoCartas (herda de Jogo)**

* Possui os atributos privados: qtdJogadores (int), deck (ArrayList de String).
* O construtor possui 5 parâmetros: os 3 parâmetros da superclasse Jogo, além de deck e qtdJogadores. Os 3 primeiros parâmetros devem ser repassados para o construtor da superclasse. Os dois últimos atributos são inicializados com o que recebem nos parâmetros.
* Possui o método getDeck(). O método retorna uma String com todas as cartas do deck e separadas por ponto-e-vírgula. Você pode ganhar uns décimos EXTRAS se exibir as cartas em ordem aleatória. Pode usar qualquer biblioteca existente no Java.
* Sobrescreve o método toString(). Retorna uma String com as informações dos atributos da superclasse, além da quantidade de jogadores.

**Classe JogoEletronico (herda de Jogo)**

* Possui os atributos privados: plataformas (ArrayList de String), categoria (String) e categorias (vetor de String), declarado com os tipos “Ação”, “Esporte” e “Estratégia”.
* O construtor possui 5 parâmetros: os 3 parâmetros da superclasse Jogo, além de plataformas e numCateg (int). Os 3 primeiros parâmetros devem ser repassados para o construtor da superclasse. O atributo plataformas é inicializado com o que recebe no parâmetro. O atributo categoria é inicializado buscando no vetor categorias a posição informada em numCateg.
* Possui o método getPlataformas(). O método retorna uma String com todas as plataformas do jogo e separadas por ponto-e-vírgula. Você pode ganhar uns décimos EXTRAS se exibir as plataformas em ordem alfabética. Pode usar qualquer biblioteca existente no Java.
* Sobrescreve o método toString(). Retorna uma String com as informações dos atributos da superclasse, além da categoria.
* Use a classe ProjetoJogo disponibilizada para atividade do Classroom como sua classe principal.

## Tecnologias usadas

*   Java; 
*   JDK 8; 
