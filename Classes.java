import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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

    public static int nOcorrencias(ArrayList<Integer> lista, Integer elemento) {
        int contador = 0;

        for (Integer num : lista) {
            if (num.equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }

    public static int nroRepeat(ArrayList<Integer> l) {

        Map<Integer, Integer> countMap = new HashMap<>();

        for (Integer num : l) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int repeatCount = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                repeatCount++;
            }
        }

        return repeatCount;
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {

        HashSet<Integer> set1 = new HashSet<>(l1);
        HashSet<Integer> set2 = new HashSet<>(l2);

        HashSet<Integer> intersectionSet = new HashSet<>();

        for (Integer num : set1) {
            if (set2.contains(num)) {
                intersectionSet.add(num);
            }
        }

        ArrayList<Integer> result = new ArrayList<>(intersectionSet);

        return result;
    }

    /*
     * b. Método que retorna true se l tem elementos repetidos
     */
    public static boolean hasRepeat(ArrayList<Integer> l) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : l) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    /*
     * e. Método que retorna a união de l1 e l2
     */
    public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        HashSet<Integer> set = new HashSet<>(l1);
        set.addAll(l2);
        return new ArrayList<>(set);
    }
}
