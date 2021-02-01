# Leitura de Arquivo - Nome e Idade

## Objetivo

Exercícios da Disciplina Desenvolvimento de Sistemas I, do Curso Técnico de Desenvolvimento de Sistemas, SENAI Bahia. A disciplina tem como objetivo a introdução dos conceitos de Programação Orientada a Objetos (POO), utilizando a linguagem de programação JAVA.

## Exercício

* Programa simples em Java, utilizando os conceitos de Manipulação de Arquivos.

Nesta atividade, vocês devem implementar um menu no console, para que o usuário tenha 3 opções ao iniciar o programa:

* Cadastrar dados
* Obter dados
* Sair

**Cadastrar dados:** 

* Três informações diferentes devem ser solicitadas no console. Por exemplo: nome, idade e altura.

O dado deve ser escrito em um arquivo info.txt externo, e cada campo deve ser separado por ponto-e-vírgula.

* Exemplo:

``` 
Informe seu nome:
Chapolin
Informe sua idade:
60
Informe sua altura:
1.60`
```

* O programa deve gravar no arquivo: `Chapolin;60;1.60` e pular para a próxima linha. Para isso, chame o método escreverArquivo() da classe FileOperations.java, disponibilizada abaixo.

**Obter Dados**

* Serve somente para buscar as informações do arquivo info.txt e exibir na tela, linha por linha. Para tal, chame o método lerArquivo(), de FileOperations.java.
* Dica: talvez o método split() (de String) seja bastante útil.

**Sair**

* Serve para encerrar o programa.

## Tecnologias usadas

*   Java; 
*   JDK 8; 
