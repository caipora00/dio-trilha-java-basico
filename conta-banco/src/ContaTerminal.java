import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TO DO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuario
        //Obter para classe Scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = sc.next();
        System.out.println("\nPor favor, digite o número da sua Agência!");
        agencia = sc.next();
        System.out.println("\nPor favor, digite o número da sua conta!");
        numero = sc.nextInt();
        System.out.println("\ngPor favor, informe seu saldo!");
        saldo = sc.nextDouble();

        System.out.println("Ola, " + nomeCliente + "obrigado por criaruma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.");
    }
}
