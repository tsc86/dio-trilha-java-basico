public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        double saldo = 25.5;
        double valorSolicitado = 27.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        
        }else{
            System.out.println("Saldo insuficiente ");
        }    
    }
}
