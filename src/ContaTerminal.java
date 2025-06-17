import java.util.Scanner;

public class ContaTerminal {
    public  static  void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo, informe seu nome");
        String nome = scanner.next();
        System.out.println("Informe o número da sua conta");
        int numeroConta = scanner.nextInt();
        System.out.println("Informe a sua agência");
        int agencia = scanner.nextInt();
        System.out.println("Informe o seu saldo");
        float saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %f ja está disponivel para saque", nome,agencia,numeroConta,saldo);
    }
}
