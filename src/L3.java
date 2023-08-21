import java.util.ArrayList;
import java.util.List;

public class L3 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(15);
        numeros.add(8);
        numeros.add(23);
        numeros.add(19);
        numeros.add(27);
        numeros.add(5);

        int numero1 = 19;
        int numero2 = 25;

        
        if (numeros.contains(numero1)) {
            System.out.println("O número " + numero1 + " existe na lista.");
        } else {
            System.out.println("O número " + numero1 + " não existe na lista.");
        }

       
        if (numeros.contains(numero2)) {
            System.out.println("O número " + numero2 + " existe na lista.");
        } else {
            System.out.println("O número " + numero2 + " não existe na lista.");
        }
    }
}