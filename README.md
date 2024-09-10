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

- ## class #3

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

- ## class #4

- Identação: Termo utilizado para escrever o código de forma hierárquica, facilitando a visualização e entendimento;
