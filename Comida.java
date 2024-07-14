import java.util.concurrent.ThreadLocalRandom;


public class Comida {
    public static void main(String[] args) {
        double mesada = 50.0;
        int totalDoces = 0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho");
            mesada -= valorDoce;
            totalDoces++;
            System.out.println("Mesada restante: " + mesada);
        }

        System.out.println("João gastou toda sua mesada em doces");
        System.out.println("João comprou o total de doces em: " + totalDoces);
        System.out.println("João vai ter carries assim");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
