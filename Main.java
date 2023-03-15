import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Cadastro c = new Cadastro();
        int n1;

        System.out.println("Digite seu codigo: ");
        c.setCodigo(sc.nextInt());

        System.out.println("Digite seu nome: ");
        c.setNome(sc.next());

        System.out.println("Digite a quantidade: ");
        c.setQuantidade(sc.nextInt());

        System.out.println("Cadastro realizado com sucesso!!");


        System.out.println("1: Continuar \n2: Finalizar");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Quantos voce deseja decrementar");
                n1 = sc.nextInt();
                c.sub(n1);
                System.out.println(c.getQuantidade());
                break;
            case 0:
                System.out.println("Encerrando Cadastro");
                break;
        }

    }
}