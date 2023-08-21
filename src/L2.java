import java.util.ArrayList;
import java.util.List;

public class L2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(15);
        numeros.add(8);
        numeros.add(23);
        numeros.add(19);
        numeros.add(27);
        numeros.add(5);

       
        double soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        double media = soma / numeros.size();
        System.out.println("A média dos elementos da lista é: " + media);
    }
}