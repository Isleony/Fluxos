public class CaixaEletronico {

    //condição simples

    public static void main(String[] args) {
        double saldo = 665.70;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(" Novo saldo: "+ "" + saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }


    }
}
