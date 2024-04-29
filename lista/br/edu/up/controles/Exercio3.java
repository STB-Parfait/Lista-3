package lista.br.edu.up.controles;
import lista.br.edu.up.modelos.Vendedor;

public class Exercio3 {
    public static void executar() {
        /*3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
        por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobresuas vendas efetuadas, 
        informar o seu nome, o salário fixo e salário no final do mês*/
        
        String nome = "Pablo";
        double salarioFixo = 2500;
        double vendas = 200;
        
        Vendedor pessoa1 = new Vendedor(nome, salarioFixo, vendas);
        pessoa1.setNome("Joao");
        pessoa1.setSalarioFixo(2000);
        pessoa1.setTotalVendas(300);
        pessoa1.calcularSalarioTotal();

        System.out.printf("Nome: %s\n", pessoa1.getNome());
        System.out.printf("Salário fixo: %s\n", pessoa1.getSalarioFixo());
        System.out.printf("Salário total: %s", pessoa1.getSalarioTotal());
        
    }
}

