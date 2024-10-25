package Program;

import Entities.Validador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Abre o Scanner para entrada de Dados
        Scanner sc = new Scanner(System.in);
        //Instancia um novo objeto
        Validador validador = new Validador();
        //Solicita ao usuário que digite um CNPJ
        System.out.println("Digite um número de CNPJ: ");
        //Armazena o CNPJ digitado na variável CNPJ
        validador.CNPJ = sc.nextLine();

        //Transforma o resultado obtido no metodo em variavel int
        int primeiroVeri = validador.primeiroVerificador();
        int segundoVeri = validador.segundoVerificador();

        //Transforma os digitos verificadores em int atraves da tabela unicode ASCII
        char a = validador.CNPJ.charAt(12);
        int b = a - 48;
        char c = validador.CNPJ.charAt(13);
        int d = c - 48;
        //Cria um estrutura para caso o valor do cálculo dos digitos seja 10 para transformá-lo em 0 conforme calculo
        if (primeiroVeri == 10){
            primeiroVeri = 0;
        }
        else if (segundoVeri == 10){
            segundoVeri = 0;
        }
        //Estrutura que compara os resultados obtidos com os ultimos dígitos e imprime se é válido ou não
        if (primeiroVeri == b && segundoVeri == d) {
            System.out.println("CNPJ válido");
        }
        else {
            System.out.println("CNPJ inválido");
        }
        //Fecha o Scanner
        sc.close();
    }
}