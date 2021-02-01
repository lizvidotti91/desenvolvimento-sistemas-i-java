# Instrumentos Musicais

## Objetivo

Exercícios da Disciplina Desenvolvimento de Sistemas I, do Curso Técnico de Desenvolvimento de Sistemas, SENAI Bahia. A disciplina tem como objetivo a introdução dos conceitos de Programação Orientada a Objetos (POO), utilizando a linguagem de programação JAVA.

## Exercício

Aplicação dos conceitos de Classe Abstrata e Interface.

**Classe Abstrata InstrumentoMusical**

* Possui um enum chamado TipoInstrumento, com três valores: SOPRO, CORDA e PERCUSSAO.
* Possui dois atributos privados: nome (String) e tipo (TipoInstrumento).
* Possui um construtor para inicializar os dois atributos acima, além dos getters dos dois atributos.
* Possui o método abstrato tocar(), que recebe uma canção (String) e retorna uma String.
* Possui o método abstrato afinar(), que retorna uma String.

**Classe Violao (herda de InstrumentoMusical)**

* Possui um construtor sem parâmetros. Dentro dele, chama o construtor da superclasse, repassando o nome do instrumento (violão, obviamente) e o tipo. Para repassar o tipo, chame o enum TipoInstrumento e selecione CORDA.
* Implementa os métodos tocar() e afinar(). Cada método retorna mensagem específica sobre o violão. Por exemplo, para o método afinar, o retorno pode ser algo como: “Afinando as cordas do violão!”

**Classe FlautaDoce (herda de InstrumentoMusical)**

* Possui um construtor sem parâmetros. Dentro dele, chama o construtor da superclasse, repassando o nome do instrumento (flauta doce, obviamente) e o tipo. Para repassar o tipo, chame o enum TipoInstrumento e selecione SOPRO.
* Implementa os métodos tocar() e afinar(). Cada método retorna mensagem específica sobre a flauta. Por exemplo, para o método afinar, o retorno pode ser algo como: “Reencaixando a flauta para a afinação!”

* Crie uma classe principal, instancie um objeto Violao e um FlautaDoce. Chame os métodos para verificar seu funcionamento.

## Tecnologias usadas

*   Java; 
*   JDK 8; 
