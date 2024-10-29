package Entities;

    public class Validador {
        //Cria uma variável String para armazenar o CNPJ e manipula-lo
        public String CNPJ;

        //Retorna true ou false caso o CNPJ digitado tenha mais ou menos de 14 digítos ou seja uma sequência de números iguais
        public static boolean validarFormato (String CNPJ){
            if (CNPJ.length() != 14){
                return false;
            } else if (CNPJ.matches("(\\d)1{13}")) {
                return false;
            }
            return true;
        }

        //Metodo para transformar o char em int através da tabela ASCII e calcula o soma dos produtos do CNPJ para verificar o primeiro digito
        public int somaDigitos (){
            return ((CNPJ.charAt(11)- 48)* 2)
                    +((CNPJ.charAt(10)- 48)* 3)
                    +((CNPJ.charAt(9)- 48)* 4)
                    +((CNPJ.charAt(8)- 48)* 5)
                    +((CNPJ.charAt(7)- 48)* 6)
                    +((CNPJ.charAt(6)- 48)* 7)
                    +((CNPJ.charAt(5)- 48)* 8)
                    +((CNPJ.charAt(4)- 48)* 9)
                    +((CNPJ.charAt(3)- 48)* 2)
                    +((CNPJ.charAt(2)- 48)* 3)
                    +((CNPJ.charAt(1)- 48)* 4)
                    +((CNPJ.charAt(0)- 48)* 5);
        }
        //Metodo para transformar o char em int através da tabela ASCII e calcula o soma dos produtos do CNPJ para verificar o segundo digito
        public int somaDigitosDois (){
            return ((CNPJ.charAt(12)- 48)* 2)
                    +((CNPJ.charAt(11)- 48)* 3)
                    +((CNPJ.charAt(10)- 48)* 4)
                    +((CNPJ.charAt(9)- 48)* 5)
                    +((CNPJ.charAt(8)- 48)* 6)
                    +((CNPJ.charAt(7)- 48)* 7)
                    +((CNPJ.charAt(6)- 48)* 8)
                    +((CNPJ.charAt(5)- 48)* 9)
                    +((CNPJ.charAt(4)- 48)* 2)
                    +((CNPJ.charAt(3)- 48)* 3)
                    +((CNPJ.charAt(2)- 48)* 4)
                    +((CNPJ.charAt(1)- 48)* 5)
                    +((CNPJ.charAt(0)- 48)* 6);
        }
        //Metodo que calcula o módulo da soma do primeiro digito
        public int restoSomaUm() {
            return somaDigitos() % 11;
        }
        //Metodo que calcula o primeiro digito verificador
        public int primeiroVerificador (){
            return 11 - restoSomaUm();
        }
        //Metodo que calcula o modulo do segundo calculo da soma
        public int restoSomaDois (){
            return somaDigitosDois() % 11;
        }
        //Metodo que calcula o segundo digito verificador
        public int segundoVerificador () {
            return 11 - restoSomaDois();
        }
    }


