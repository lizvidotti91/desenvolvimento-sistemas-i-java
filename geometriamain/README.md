# Geometria

## Objetivo

Exercícios da Disciplina Desenvolvimento de Sistemas I, do Curso Técnico de Desenvolvimento de Sistemas, SENAI Bahia. A disciplina tem como objetivo a introdução dos conceitos de Programação Orientada a Objetos (POO), utilizando a linguagem de programação JAVA.

## Exercício

Aplicação dos conceitos de elementos estáticos e finais.

Classe Quadrado

* Crie dois atributos privados do tipo double: lado (não-estático) e diag (estático).
* Inicialize apenas o atributo lado no construtor.
* Crie o método calcularArea(), que retorna um double. A fórmula para calcular a área do quadrado é: lado x lado.
* Crie o método calcularPerimetro(), que retorna um double. A fórmula para calcular o perímetro é: lado x 4.
* Crie o método calcularDiagonal(), que retorna um double. A fórmula para calcular a diagonal é: lado * diag.
* Crie o método estático atualizarDiagonal(), que recebe um double como parâmetro. O método apenas vai atualizar o valor de diag pelo valor passado por parâmetro.

Classe Circulo (sem acento mesmo)

* Crie dois atributos privados do tipo double: raio (não-estático) e pi (estático).
* Inicialize apenas o atributo raio no construtor.
* Crie o método calcularArea(), que retorna um double. A fórmula para calcular a área do círculo é: pi x raio².
* Crie o método calcularCircunferencia(), que retorna um double. A fórmula para calcular a circunferência é: 2 x pi x raio.
* Crie o método estático atualizarPi(), que recebe um double como parâmetro. O método apenas vai atualizar o valor de pi pelo valor passado por parâmetro.

Classe GeometriaMain
Parte do código já foi fornecida na classe abaixo. Não apague o que já contém. Apenas complemente da seguinte forma:

* Chame o método atualizarDiagonal() de Quadrado, passando como parâmetro a raiz de 2 da classe Math. Portanto, passe como parâmetro: Math.sqrt(2)
* Exiba novamente o valor da diagonal de q1.
* Chame o método atualizarPi() de Circulo, passando como parâmetro o valor de pi da classe Math. Portanto, passe como parâmetro: Math. PI
* Exiba novamente os valores da área e circunferência de c1.

## Tecnologias usadas

*   Java; 
*   JDK 8; 
