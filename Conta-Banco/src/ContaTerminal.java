import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:
        /*conhecer e importar classe scanner
         *
         * exibir mensagens p o usuario
         * 
         * obter os valor digitados no terminal
         * 
         * exibir a mensagem final da conta criada
         */
        int numero;
        String agencia;
        String cliente;
        double saldo;

        //conhecer e importar classe scanner
        Scanner sc = new Scanner(System.in);
        
        //exibir mensagens p o usuario e obter os valor digitados no terminal
        System.out.println("Seja bem-vindo! Por favor, digite seu nome:");
            cliente = sc.nextLine();

            System.out.println("Digite o número da sua conta:");
            numero = sc.nextInt();

            sc.nextLine(); // Limpar o buffer após a leitura de um número inteiro

            System.out.println("Digite o número da sua Agência:");
            agencia = sc.nextLine();

            System.out.println("Digite o seu saldo:");
            // Ler a entrada como uma string e converter para double
            String saldoString = sc.nextLine();
            saldo = Double.parseDouble(saldoString);

        System.out.println("");
        //exibir a mensagem final da conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", cliente, agencia, numero, saldo);
    }
}
