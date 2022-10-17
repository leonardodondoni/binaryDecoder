import java.util.Scanner;
import java.util.stream.*;
public class decodificadorDeBinario{
    public static void main(String args[]){
        /*Objetivo: implementar um Decodificador de Binário.

        Descrição das Funcionalidades: o programa deve solicitar um número em binário, perguntando a quantidade de bits e o número em si (garanta a consistência dos dados).
        A seguir, o programa deve exibir o significado dos binários, considerando:

        que seja um número inteiro sem sinal;
        um número inteiro representado em Complemento de 2;
        se tiver 8 bits ou menos, o caracter representado pela sequência em binário;
        Volte a pedir novos dados até que o usuário digite uma opção para sair. */
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número em binário: ");
        String inputBinaryNumber = input.nextLine();
        int[] binaryNumberArray = new int[inputBinaryNumber.length()];
        System.out.print("Digite a quantidade de bits: ");
        int inputBitsQuantity = input.nextInt();

        if (inputBitsQuantity != inputBinaryNumber.length()) {
            System.out.println("A quantidade de bits inserido não está igual a informada.");
            return;
        }

        for (int i = 0; i < inputBinaryNumber.length(); i++) {
            try {
                int number = Integer.parseInt(String.valueOf(inputBinaryNumber.charAt(i)));
                binaryNumberArray[i] = number;
            } catch (Exception e) {
                System.out.println("Digite apenas números."); 
                return;     
            }
        }

        for (int binaryNumber : binaryNumberArray) {
            if (binaryNumber != 0 && binaryNumber != 1) {
                System.out.println("Digite apenas 0 e 1.");
                return;
            }
        }

    }
}