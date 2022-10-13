public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado Mateus = new Empregado();
        Empregado Maria = new Empregado();
        Empregado Jose = new Empregado();

        Mateus.setTipo(1);
        Maria.setTipo(2);
        Jose.setTipo(3);

        Mateus.setSalario(2000);
        Maria.setSalario(1700);
        Jose.setSalario(1500);

        Maria.setComissao(0.2);
        Jose.setBonus(400);

        System.out.println(Mateus.calculaSalario());
        System.out.println(Maria.calculaSalario());
        System.out.println(Jose.calculaSalario());
    }
}
