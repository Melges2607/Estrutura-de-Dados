public class PalindromeNumber {

    public static void main(String[] args) {
        int numero = 121;
        int[] listaDigitos = convertToDigitArray(numero);

        System.out.println(verificaSeEPalindromo(listaDigitos));
    }

    public static int[] convertToDigitArray(int numero) {
        String numeroString = String.valueOf(Math.abs(numero)); // Convertendo para positivo
        int[] listaDigitos = new int[numeroString.length()];

        for (int i = 0; i < listaDigitos.length; i++) {
            listaDigitos[i] = numeroString.charAt(i) - '0'; // Convertendo caractere para número
        }

        return listaDigitos;
    }

    public static boolean verificaSeEPalindromo(int[] listaDigitos) {
        int i = 0;
        int j = listaDigitos.length - 1;

        while (i < j) {
            if (listaDigitos[i] != listaDigitos[j]) {
                return false; // Não é um palíndromo
            }
            i++;
            j--;
        }

        return true; // É um palíndromo
    }
}
