import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Variaveis {

    public static void main (String [] args){
        int a, b;
        short f;

        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b= in.nextInt();
        int c=a+b;
        int d = 6;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        while(a == b){
            //trecho
            System.out.println("Valores Iguais");
            a--;
        }
        //for(){

        //}


        /*while
        (true) {
            if (!(c > 5 && d != c)) {
                System.out.println("VALOR VERDADEIRO");
            } else if (c < 0) System.out.println("VALOR INDIFERENTE");

            else {
                System.out.println("VALOR FALSO");
            }
        }
        */

        //resto do
        /*
        d == c; igual
        d > c; maior que
        d < c; menor que
        d >= c; maior ou igual
        d <= c; menor ou igual
        d != c; diferente de

        e: &&
        ou: ||
        !: negação

        Variaveis:
        int: inteiro
        float: numero com ponto
        double: numero com ponto preciso
        char: caracter ex: 'a'
        String: frase, ex: "Olá, Mundo"
        boolean: true or false
        Restrições:
        n pode ter espaço
        n pode começar com numero
        n pode ter acento
        in.nextInt();
         */

        // operadores:
        /*
        Soma: +
        Subtração: -
        Mult: *
        Div: /
        Resto de div inteira: %
         */


    }
}
