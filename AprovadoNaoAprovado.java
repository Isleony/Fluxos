public class AprovadoNaoAprovado {
    public static void main(String[] args) {
        //controle de fluxo encandeado na condição ternária
        int nota = 5;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        //código mais limpo
    }
}
