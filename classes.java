import java.util.ArrayList;

public class Classes {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);

        Integer elementoProcurado = 2;
        int ocorrencias = nOcorrencias(numeros, elementoProcurado);

        System.out.println("O elemento " + elementoProcurado + " ocorre " + ocorrencias + " vezes na lista.");
    }

    public static int nOcorrencias(ArrayList<Integer> lista, Integer elemento) {
        int contador = 0;

        for (Integer num : lista) {
            if (num.equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }

}
