public class For {
    //estrutura do controle de fluxo
    //for(bloco de inicialização; expressão booleana de validação; bloco de atualização)

    //-> comando será executado até que a
    //-> expressão de validaçãotorne-se falsa

    //Jão precisacontar até 20 carneirinho para pegar no sono
    public static void main(String[] args) {
        for (int carneirinho = 1; carneirinho <=20; carneirinho++){
            System.out.println("Contando carneirinhos: " + carneirinho);
        }
        System.out.println("João dormiu");
    }
}
