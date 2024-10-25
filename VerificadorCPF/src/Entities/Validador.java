package Entities;

public class Validador {
    //Cria uma variável do tipo String do CPF
    public String CPF;

    //Metodo que soma que transforma pela tabela unicode, multiplica e depois soma os dígitos do CPF para encontrar o primeiro digito
    public int somaDigitos() {
        return ((CPF.charAt(0) - 48) * 10)
                + ((CPF.charAt(1) - 48) * 9)
                + ((CPF.charAt(2) - 48) * 8)
                + ((CPF.charAt(3) - 48) * 7)
                + ((CPF.charAt(4) - 48) * 6)
                + ((CPF.charAt(5) - 48) * 5)
                + ((CPF.charAt(6) - 48) * 4)
                + ((CPF.charAt(7) - 48) * 3)
                + ((CPF.charAt(8) - 48) * 2);
    }
    //Metodo que obtém o módulo da soma do primeiro dígito
    public int moduloSoma() {
        return somaDigitos() % 11;
    }
    //Metodo que obtem o primeiro verificador
    public int primeiroVerificador() {
        return 11 - moduloSoma();
    }
    //Metodo que soma que transforma pela tabela unicode, multiplica e depois soma os dígitos do CPF para encontrar o segundo digito
    public int somaDigitosDois() {
        return ((CPF.charAt(0) - 48) * 11)
                + ((CPF.charAt(1) - 48) * 10)
                + ((CPF.charAt(2) - 48) * 9)
                + ((CPF.charAt(3) - 48) * 8)
                + ((CPF.charAt(4) - 48) * 7)
                + ((CPF.charAt(5) - 48) * 6)
                + ((CPF.charAt(6) - 48) * 5)
                + ((CPF.charAt(7) - 48) * 4)
                + ((CPF.charAt(8) - 48) * 3)
                + ((CPF.charAt(9) - 48) * 2);
    }
    //Metodo que obtém o módulo da soma do segundo dígito
    public int moduloSomaDois() {
        return somaDigitosDois() % 11;
    }
    //Metodo que obtem o segundo verificador
    public int segundoVerificador() {
        return 11 - moduloSomaDois();
    }
    //Transforma o penúltimo dígito do CPF em int através da tabela unicode ASCII
    public int primerioVerifica() {
        return CPF.charAt(9) - 48;
    }
    //Transforma o último dígito do CPF em int através da tabela unicode ASCII
    public int segundoVerifica() {
        return CPF.charAt(10) - 48;
    }

}