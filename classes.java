import java.util.ArrayList;

public class Classes {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> inputList = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);

        Integer elementoProcurado = 2;
        int ocorrencias = nOcorrencias(numeros, elementoProcurado);

        System.out.println("O elemento " + elementoProcurado + " ocorre " + ocorrencias + " vezes na lista.");

        inputList.add(1);
        inputList.add(2);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        inputList.add(4);
        inputList.add(4);

        ArrayList<Integer> repeatedElements = listRepeat(inputList);
        System.out.println("Elementos Repetidos: " + repeatedElements);
    }

    public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> repeatedList = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer num : l) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedList.add(entry.getKey());
            }
        }

        return repeatedList;
    }
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
