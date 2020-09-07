package poo.br.edu.unidesc.atividade1;

//Atividade: Fizz Buzz - Vale 1 ponto de OAT
//Professor: Wesley Queiroz
//Materia: Programação orientada a objetos
//Aluno: Vitor Hugo Da Costa Sousa

/*          Escreva um programa em java (void main)
            que vai imprimir os números de de 0 a 100, com uma condição:

            quando o número for múltiplo de 3 escreve FIZZ
            quando o número for múltiplo de 5 escreve BUZZ
            quando o número for múltiplo de 3 e 5 escreve FIZZBUZZ

            Exemplo:
            1, 2, FIZZ, 4, BUZZ, 6, 7, 8, FIZZ,......
            Usar laço de repetição for
            Usar If/ Else

            */

public class Main {

    public static void main(String[] args) {
        for (int i=0; i <= 100; i++) {
            if (i == 0) {
                System.out.println(i);
            } else if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
