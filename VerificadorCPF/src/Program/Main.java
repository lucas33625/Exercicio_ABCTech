package Program;

import Entities.Validador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Abre o Scanner para entrada de dados do usuário
        Scanner sc = new Scanner(System.in);
        //Instancia um novo objeto
        Validador validador = new Validador();
        //Pede ao usuário para digitar um número de CPF
        System.out.println("Digite um CPF: ");
        //Armazena o CPF digitado
        validador.CPF = sc.nextLine();

        //Chama o metodo para validar o formato do CPF dentro da estrutura condicional para parar o programa caso esteja fora do formato certo
        if (!Validador.validarFormato(validador.CPF)) {
            System.out.println("CPF invalido, por favor digite um número de CPF válido");
            return;
        }


        //Transforma o cálculo do primeiro e segundo dígito verificador em int
        int primeiroVer = validador.primeiroVerificador();
        int segundoVer = validador.segundoVerificador();

        //Cria uma variável a e b para manipular caso o resultado de um dos verificadores dê o valor 10
        int a = primeiroVer;
        int b = segundoVer;

        //Estrutura para caso dê o valor 10 transforme no número 0 conforme cálculo de validação de CPF
        if (a == 10) {
            a = 0;
        }
        if (b == 10) {
            b = 0;
        }

        //Estrutura que define se o CPF é válido ou não e imprime na tela o resultado
        if (a == validador.primerioVerifica() && b == validador.segundoVerifica()) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }
        sc.close();

    }
}