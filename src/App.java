public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Empresa!");
        Vendedor joaoVendedor = new Vendedor("João", "12345678", 10.0, 5);
        double salarioJoao = joaoVendedor.calcularSalario();
        System.out.println("O salário de João = " + salarioJoao);

        Consultor mariaConsultor = new Consultor("Maria", "03456789", 100.0, 10L);
        System.out.println("O salário de Maria = " + mariaConsultor.calcularSalario()); 
    }
}
