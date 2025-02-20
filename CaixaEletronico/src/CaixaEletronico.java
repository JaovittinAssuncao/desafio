import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        long contaBruno =Long.parseLong( "12345678901");
        String senhaBruno = "123456";
        double saldoBruno = 2200.99;

        System.out.println("Digite Seu Cpf");
        long cpfConta = scanner.nextLong();

        System.out.println("Digite Sua senha");
        String senhaConta = scanner.next(); 

        if (cpfConta == contaBruno && senhaConta.equals(senhaBruno)) {
            System.out.println("Conta acessada com sucesso!!");
            System.out.println("Digite 1 para Saque,Digite 2 para Déposito e Digite 3 para ver saldo disponível");
            int acaoConta = scanner.nextInt();
            if(acaoConta == 1) {
                 System.out.println("Quanto Você Deseja sacar?");
                double saqueBruno = scanner.nextDouble();
                double saldoAtualSaque = saldoBruno - saqueBruno;
                System.out.println("Seu saldo atual é " + saldoAtualSaque);
            }else if (acaoConta == 2) {
                System.out.println("Quanto Você Deseja depositar?");
                double depositoBruno = scanner.nextDouble();
                double saldoAtualDeposito = saldoBruno + depositoBruno;
                System.out.println("Seu saldo atual é " + saldoAtualDeposito);

            }else if (acaoConta == 3) {
                System.out.println("Seu saldo atual é " + saldoBruno);
            }else
            System.out.println("Esta ação esta indisponível");
        }   
        else 
        System.out.println("Senha ou Conta Errada");
    }
}
