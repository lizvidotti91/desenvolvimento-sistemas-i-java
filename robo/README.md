# Robô

## Objetivo

Exercícios da Disciplina Desenvolvimento de Sistemas I, do Curso Técnico de Desenvolvimento de Sistemas, SENAI Bahia. A disciplina tem como objetivo a introdução dos conceitos de Programação Orientada a Objetos (POO), utilizando a linguagem de programação JAVA.

## Exercício

Aplicação dos conceitos de Classe Abstrata e Interface.

**Interface Robo**

* Possui os métodos iniciar(), desligar() e recarregar(). Os três retornam uma String.

**Classe RoboMedico (implementa Robo)**

* Implementa os três métodos da interface, exibindo mensagens específicas sobre um robô médico. Por exemplo, para o método iniciar(), o retorno pode ser algo como: “Iniciando os sensores médicos de toque e visão raio-x!”
* Possui o método cortar(), que recebe um órgão (String) como parâmetro e retorna uma String. Esse método retorna uma frase informando que o robô está realizando um corte naquele órgão do paciente.
* Possui o método costurar(), que também recebe um órgão e retorna uma String. O método retorna uma mensagem sobre o robô estar costurando o órgão do paciente.

**Classe RoboArqueologo (implementa Robo)**

* Implementa os três métodos da interface, exibindo mensagens específicas sobre um robô arqueólogo. Por exemplo, para o método iniciar(), o retorno pode ser algo como: “Iniciando os sensores arqueológicos de luz e detecção do material!”
* Possui o método cavar(), que recebe um local (String) como parâmetro e retorna uma String. O método retorna uma frase informando que o robô está cavando naquele local.

* Crie uma classe principal, instancie um objeto RoboMedico e um RoboArqueologo. Chame os métodos para verificar seu funcionamento.

## Tecnologias usadas

*   Java; 
*   JDK 8; 
