# Adoção Pet

## Objetivo

Exercícios da Disciplina Desenvolvimento de Sistemas I, do Curso Técnico de Desenvolvimento de Sistemas, SENAI Bahia. A disciplina tem como objetivo a introdução dos conceitos de Programação Orientada a Objetos (POO), utilizando a linguagem de programação JAVA.

## Exercício

Aplicação dos conceitos de encapsulamento, relacionamento entre classes, elementos estáticos e finais, listas.

Classe Pet

* Possui os atributos privados: nome (String), raca (String), idade (int), peso (double), sexo (char)
* Possui o atributo público, estático e final: raças (String[]). Esse vetor é inicializado com as raças Vira-Lata, Labrador, Pastor Alemão e São Bernardo.
* Possui um construtor, inicializando todos os atributos privados com os parâmetros recebidos.
* Possui o método getInfoPet(), que retorna uma String com as informações do pet (nome, raça, idade, peso e sexo).

Classe Responsavel (sem acento mesmo!)

* Possui os atributos privados: CPF (String), nome (String), idade (int), petsAdotados (ArrayList<Pet>).
* Possui um construtor, inicializando os três primeiros atributos com os parâmetros recebidos. Ainda dentro do construtor, a lista petsAdotados é instanciada.
* Possui o método adotarPet(), que recebe um pet como parâmetro e retorna um booleano. Caso a idade do responsável seja 18+, o pet é adicionado em petsAdotados e o método retorna verdadeiro. Do contrário, retorna falso.
* Possui o método listarPets(), que retorna uma String com os dados dos pets da lista petsAdotados. Sugestão para implementar o método: crie uma String inicialmente vazia, percorra a lista petsAdotados e vá concatenando na String as informações de cada animal (obtidas de getInfoPet()). Ao final, retorne essa String.
* Possui o método getInfoResponsavel(), que retorna uma String com as informações da pessoa (nome, idade e CPF).

Classe AdocaoMain

* Os métodos realizarAdocao(), listarPetsAdotados() e listarPetsRestantes() já foram implementados. Você precisa somente implementar o método main.
* No método main, instancie 4 objetos Pet, passando informações quaisquer de nome, idade, peso e sexo (M ou F). Cada pet deve ser de uma das 4 raças diferentes. Para passar a raça como parâmetro, pegue do vetor racas criado em Pet (aquele que é público e estático).
* Em seguida, crie um ArrayList de Pet chamado petsParaAdocao e adicione os 4 objetos instanciados acima. - Crie um objeto Responsavel, passando informações aleatórias sobre a pessoa. E também crie um objeto Scanner para fazer a leitura dos dados a seguir.
* Na sequência, o programa exibe um menu inicial com quatro opções: 1) Adotar pet; 2) Listar pets adotados; 3) Listar pets restantes; 4) Sair. Peça para a pessoa informar o que desejar fazer. Se a opção 1 for escolhida, chame o método realizarAdocao(). Se 2 for selecionado, chame o método listarPetsAdotados(). Caso a opção informada seja 3, chame listarPetsRestantes(). Passe corretamente os parâmetros ao chamar cada método.
* O programa deve ser encerrado apenas quando 4 for digitado no menu inicial. Portanto, quando uma das operações acima é finalizada, o programa retorna ao menu inicial. Não se preocupe em tratar entradas como letras, caracteres ou números inválidos para o programa.

## Tecnologias usadas

*   Java; 
*   JDK 8; 
