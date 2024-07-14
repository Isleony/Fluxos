import java.util.HashMap;
import java.util.Map;

public class CestaFrutas {
    public static void main(String[] args) {
        String[] vegetais = {"Alface", "Brócolis", "Cenoura", "Espinafre", "Tomate", "Pimentão", "Abóbora", "Pepino", "Couve-flor", "Ervilha", "Repolho", "Beterraba", "Berinjela", "Nabo", "Aipo", "Abobrinha", "Rúcula", "Rabanete", "Batata", "Cebola"};
        char[] vogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        // Criando um mapa para armazenar os vegetais e suas vogais
        Map<String, String> vegetaisComVogais = new HashMap<>();

        for (String vegetal : vegetais) {
            StringBuilder apenasVogais = new StringBuilder();
            for (char letra : vegetal.toCharArray()) {
                for (char vogal : vogais) {
                    if (letra == vogal) {
                        apenasVogais.append(letra);
                    }
                }
            }
            vegetaisComVogais.put(vegetal, apenasVogais.toString());
        }

        // Imprimir os resultados
        vegetaisComVogais.forEach((vegetal, apenasVogais) -> {
            System.out.println(vegetal + ": " + apenasVogais);
        });
    }
}
