package algoritmo;
import java.util.*;

public class SubsetGenerator {

    /**
     * Função getSubSets
     * Gera todos os subconjuntos do conjunto A usando o método de extensão.
     *
     * Como funciona:
     * 1. Começamos com o subconjunto vazio.
     * 2. Para cada elemento do conjunto inicial, pegamos todos
     * os subconjuntos e criamos uma nova cópia, adicionando o atual elemento do iterador
     * 3. Adicionamos essas novas cópias à lista de subconjuntos.
     */
    public static Set<Set<Integer>> getSubSets(Set<Integer> A) {
        Set<Set<Integer>> resultado = new HashSet<>();
        
        resultado.add(new HashSet<>());
        
        for (Integer elemento : A) {
            Set<Set<Integer>> novosSubconjuntos = new HashSet<>();
            
            for (Set<Integer> s : resultado) {
                Set<Integer> copia = new HashSet<>(s);
                copia.add(elemento);                
                novosSubconjuntos.add(copia);         
            }
            
            resultado.addAll(novosSubconjuntos);
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);

        Set<Set<Integer>> subsets = getSubSets(A);
        System.out.println(subsets);
    }
}
