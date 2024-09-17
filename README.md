# Autonomia das classes

## class #1

- Uma classe é um elemento do código Java que utilizamos para representar objetos do mundo real. Dentro dela é comum declararmos atributos e métodos;

- Por padrão, 99% das nossas aplicações iniciaram com public class e um nome intuitivo para a class;

- O void indica que não retornará nada;

- String[] args: É um parâmetro que representa um array de strings.

## class #2

- Letras maiúsculas na nomenclatura de arquivos;

- Nome da primeira instrução = nome do arquivo;

- Variável : Primeira letra MINÚSCULA e segunda palavra com inicial MAIÚSCULA, exemplo: anoFrabricacao

- Constantes : Letras maiúsculas, exemplo: ANO_2000, PI;

- Não pode conter espaços OU iniciar com um número;

- Nome único

- Pode haver caracteres especiais

## class #3

### Declaração de métodos

- TipoRetorno NomeObjetivo Parâmetro(s)

#### Chamar método
  
  -  int somar(int n1, int n2)
  -  String formatarCep(long cep)

  ### Exemplo de utilização:

  ```java
public class MyClass {
    public static void main(String[] args) {
        String firstName = "Leonardo";
        String lastName = "Oliveira";

        String fullName = completeName(firstName, lastName);

        System.out.println(fullName);
    }

    public static String completeName(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
}

```

## class #4

- Identação: Termo utilizado para escrever o código de forma hierárquica, facilitando a visualização e entendimento;

  ### Código sem identação:
  
 ```java
public class IfExample {
public static void main(String[] args) {
boolean condition = true;
if (condition) {
System.out.println("A condição é verdadeira.");
} else {
System.out.println("A condição é falsa.");
}
}
}
  ```

- Código identado está na pasta classes/src/identacao.java

 ## class #5
 - Package indica onde seu arquivo está inserido
 - Pode ser verificado nos arquivos commitados

 ## class #6

-  Java Beans -> Tenta padronizar bons costumes de programação com a linguagem java, tornando códigos mais legíveis e reutilizáveis.

-  Recomendações na declaração de variáveis: Não abreviar, singularidade (a não ser que seja um array) e padronizar o idioma utilizado.

-  Métodos normalmente são representados com UM verbo e primeiras letras das palavras em maiúsculos

# Tipos e variáveis 

## Class #1

- Tipos inteiros
    - byte
    - short
    - int
    - long -> Ao atribuir um valor, precisa inserir um caracter "L" no final, exemplo: 123456L
- Tipos decimais
    - float -> Ao atribuir um valor, precisa inserir um caracter "F" no final, exemplo: 3.14F
    - double
 
 ## Class #2

#### Constantes 

- Normalmente declaramos em CAPS LOCK;
- Utilizamos o final;
      -> Exemplo:

  ```java
  final double PI_VALUE = 3.14; 
  ```

- Representar texto:
  - String
 
# Operadores

Operadores Aritméticos: Usados para realizar operações matemáticas:

- + (adição)
- - (subtração)
- * (multiplicação)
- / (divisão)
- % (módulo, retorna o resto de uma divisão)

## Operadores de Atribuição: Atribuem valores às variáveis:

- = (atribuição simples)
- += (adição e atribuição)
- -= (subtração e atribuição)
- *= (multiplicação e atribuição)
- /= (divisão e atribuição)


## Operadores de Comparação: Comparam dois valores e retornam verdadeiro ou falso:

- == (igual a)
- != (diferente de)
- > (maior que)
- < (menor que)
- >= (maior ou igual a)
- <= (menor ou igual a)

## Operadores Lógicos: Usados para combinar expressões booleanas:

- && (E lógico - retorna verdadeiro se ambas as condições forem verdadeiras)
- || (OU lógico - retorna verdadeiro se uma das condições for verdadeira)
- ! (NÃO lógico - inverte o valor booleano)

## Operadores Unários: Operam em um único operando:

- ++ (incremento)
- -- (decremento)
- + (positivo)
- - (negativo)

## Operadores Bitwise: Operam em bits dos números inteiros:

- & (E bit a bit)
- | (OU bit a bit)
- ^ (XOR bit a bit)
- ~ (NÃO bit a bit)
- << (deslocamento à esquerda)
- >> (deslocamento à direita)

## Operador Ternário: Condicional de três partes, que funciona como um "if" em uma única linha:

condição ? valor_se_verdadeiro : valor_se_falso

## Operadores de Instância: Testam relações de objetos:

instanceof (verifica se um objeto é uma instância de uma classe ou interface)

# Métodos

- Deve ser nomeado como verbo
- Letras minúsculas, menos da segunda palavra

# Escopo

O escopo pode ser entendido como o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.

    - Escopo de método
    - ''     '' Classe
    - ''     '' Fluxo

! Interpretar delimitações e fronteiras das variáveis



