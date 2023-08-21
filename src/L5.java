import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Funcionario {

    public Funcionario(int id, String nome, double salario) {
    }

}

public class L5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de funcionários (N): ");
        int n = scanner.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do funcionário " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            funcionarios.add(new Funcionario(id, nome, salario));
        }

    }
}