package ContaBanco;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        String funcao;
        String tipoConta;
        double deposito;
        double saque;
        long cpf;
        int senha;
        int senhaDigitada;


        Scanner sc = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao Banco dos Pobres");
        System.out.println("Informe o tipo de conta que deseja abrir (Poupança/Conta Corrente) ");
        tipoConta = sc.nextLine();
        System.out.println("Agora informe seu nome completo");
        nome = sc.nextLine();
        Conta cliente1 = new Conta(5041,tipoConta,nome);
        System.out.println("Digite seu CPF");
        cpf = sc.nextLong();
        System.out.println("Por fim, crie uma senha de 4 números");
        senha = sc.nextInt();
        System.out.println("Digite uma opeção desejada (depósito/saque/fechamento de conta)");
        funcao = sc.next();
        if (funcao.equals("depósito")) {
            System.out.print("Informe o valor do depósito \nR$");
            deposito = sc.nextDouble();
            System.out.println("Digite a senha para confirmar a operação");
            senhaDigitada = sc.nextInt();
            if (cliente1.confirmarSenha(senha, senhaDigitada)) {
                cliente1.depositar(deposito);
            } else {
                System.out.println("Digite a senha correta");
            }
        } else if (funcao.equals("saque")) {
            System.out.print("Informe o valor do saque \nR$");
            saque = sc.nextDouble();
            System.out.println("Digite a senha para confirmar a operação");
            senhaDigitada = sc.nextInt();
            if (cliente1.confirmarSenha(senha, senhaDigitada)) {
                cliente1.sacar(saque);
            } else {
                System.out.println("Digite a senha correta");
            }
        } else if (funcao.equals("fechamento de conta")) {
            System.out.println("Digite a senha para confirmar a operação");
            senhaDigitada = sc.nextInt();
            if (cliente1.confirmarSenha(senha, senhaDigitada)) {
                cliente1.fecharConta();
                System.out.println("Conta fechada com sucesso!");
            } else {
                System.out.println("Digite a senha correta");
            }
        }


    }
}
