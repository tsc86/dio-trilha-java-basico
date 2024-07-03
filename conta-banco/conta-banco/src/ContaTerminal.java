import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o número da sua agência ! ");
        int agencia = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Insira o número da conta ");
        String numeroConta = scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o valor depósitado");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        
        scanner.close();

        
        

        //Exibir as mensagens para o nosso usuário
        
        //Obter pelo Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

    }
}
