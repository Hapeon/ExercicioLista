import java.util.ArrayList;
import java.util.List;

public class L1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(15);
        numeros.add(8);
        numeros.add(23);
        numeros.add(19);
        numeros.add(27);
        numeros.add(5);

        
        int maiorElemento = numeros.get(0);
        for (int num : numeros) {
            if (num > maiorElemento) {
                maiorElemento = num;
            }
        }
        System.out.println("O maior elemento da lista é: " + maiorElemento);

        
        System.out.println("Elementos da lista:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

       
        numeros.remove(Integer.valueOf(maiorElemento));

       
        System.out.println("Elementos da lista após a remoção:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}