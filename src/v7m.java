import java.util.Scanner;

public class v7m {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Room[] rooms = new Room[10];

        System.out.print("Quantos estudantes vão alugar quartos (1 a 10)? ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Registro do estudante #" + (i + 1));

            scanner.nextLine(); 

            System.out.print("Nome do estudante: ");
            String studentName = scanner.nextLine();

            System.out.print("E-mail do estudante: ");
            String studentEmail = scanner.nextLine();

            System.out.print("Escolha um quarto (0 a 9): ");
            int roomNumber = scanner.nextInt();

            rooms[roomNumber] = new Room(studentName, studentEmail);
        }

        System.out.println("\nRelatório de Ocupações:");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println("Quarto " + i + ": " + rooms[i]);
            }
        }

        scanner.close();
    }
}