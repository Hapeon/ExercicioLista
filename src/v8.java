import java.util.Scanner;

public class v8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados da pessoa " + (i + 1) + ":");
            scanner.nextLine(); 
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            System.out.print("Altura (em metros): ");
            alturas[i] = scanner.nextDouble();
        }

        double mediaAltura = 0;
        for (double altura : alturas) {
            mediaAltura += altura;
        }
        mediaAltura /= n;
        System.out.printf("A altura média das pessoas é: %.2f metros%n", mediaAltura);

        int menosDe16 = 0;
        for (int idade : idades) {
            if (idade < 16) {
                menosDe16++;
            }
        }
        double porcentagemMenosDe16 = ((double) menosDe16 / n) * 100;
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%%n", porcentagemMenosDe16);

        if (menosDe16 > 0) {
            System.out.println("Nomes das pessoas com menos de 16 anos:");
            for (int i = 0; i < n; i++) {
                if (idades[i] < 16) {
                    System.out.println(nomes[i]);
                }
            }
        }
    }
}

