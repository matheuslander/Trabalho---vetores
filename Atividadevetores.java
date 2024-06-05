import java.util.Scanner;

public class Atividadevetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 0;
        int valor = 0, menor, maior, mud1, mud2, mud3;
        double total = 0;

        System.out.println("Primeira atividade do Professor Ricardo - Vetores");
        System.out.print("Informe o tamanho do Vetor: ");
        tamanho = scanner.nextInt();
        System.out.println();

        if (tamanho <= 0) { // fazer com que o valor seja positivo e maior que 0
            while (tamanho <= 0) {
                System.out.println("O valor deve ser positivo e maior que zero!");
                System.out.println("Tente outra vez: ");
                tamanho = scanner.nextInt();
            }
        }

        int[] val = new int[tamanho];
        System.out.println("Assim, infome os valores do vetor.");
        for (int x = 0; x < tamanho; x++) {
            System.out.print("Escolha o " + (x + 1) + "º valor: ");
            val[x] = scanner.nextInt();
            total += val[x];
        }

        menor = val[0];
        maior = val[0];
        for (int x = 0; x < tamanho; x++) {
            if (menor > val[x]) {
                menor = val[x];
            }
            if (maior < val[x]) {
                maior = val[x];
            }
        }

        System.out.println( );
        System.out.print("Os valores informados são: ");
        for (int x = 0; x < tamanho; x++) {
            System.out.print("[" + (x + 1) + "] = " + val[x] + "  ");
        }

        System.out.println( );
        System.out.println( );
        System.out.println("O resultado da soma de todos os vetores é: " + total + ".");
        System.out.println("Assim, a média de todos os vetores é: " + (total / tamanho) + ".");
        System.out.println("Maior vetor é: " + maior + " / Menor é: " + menor);
        System.out.println( );

        System.out.println("Gostaria de substituir 2 valores do vetor?");
        System.out.print("Escolha entre 1 (sim) e 0 (não): ");
        mud1 = scanner.nextInt();
        if (mud1 > 1 || mud1 < 0) {
            while (mud1 > 1 || mud1 < 0) {
                System.out.println("Número inválido! Tente outra vez: ");
                mud1 = scanner.nextInt();
            }
        }
        if (mud1 == 1) {
            System.out.println( );
            System.out.print("Os valores informados anteriormente são: ");
            for (int x = 0; x < tamanho; x++) {
                System.out.print("[" + (x + 1) + "] = " + val[x] + "  ");
            }

            System.out.println( );

            System.out.println( );
            System.out.print("Selecione qual posição do vetor deseja mudar: ");
            mud2 = scanner.nextInt();
            if (mud2 > tamanho || mud2 < 1) {
                while (mud2 > tamanho || mud2 < 1) {
                    System.out.print("O valor está fora limites do vetor! Tente outra vez:");
                    mud2 = scanner.nextInt();
                }
            }
            System.out.print("Digite o novo valor: ");
            mud2--;
            mud3 = scanner.nextInt();
            val[mud2] = mud3;

            System.out.println( );
            System.out.print("Selecione outra posição que deseja mudar: ");
            mud2 = scanner.nextInt();
            if (mud2 > tamanho || mud2 < 1) {
                while (mud2 > tamanho || mud2 < 1) {
                    System.out.print("O valor está fora limites do vetor! Tente outra vez:");
                    mud2 = scanner.nextInt();
                }
            }
            System.out.print("Digite o novo valor: ");
            mud2--;
            mud3 = scanner.nextInt();
            val[mud2] = mud3;
            System.out.println( );

            System.out.print("O vetor com os novos valores ficou: ");
            for (int x = 0; x < tamanho; x++) {
                System.out.print("[" + (x + 1) + "] = " + val[x] + "  ");
            }

            System.out.println( );
            total = 0;
            for (int z = 0; z < tamanho; z++) {
                total += val[z];
            }
            menor = val[0];
            maior = val[0];
            for (int x = 0; x < tamanho; x++) {
                if (menor > val[x]) {
                    menor = val[x];
                }
                if (maior < val[x]) {
                    maior = val[x];
                }
            }

            System.out.println( );
            System.out.println("O resultado da soma de todos os vetores é: " + total + ".");
            System.out.println("Assim, a média de todos os vetores é: " + (total / tamanho) + ".");
            System.out.println("Maior vetor é: " + maior + " / Menor é: " + menor);
        }
    }
}