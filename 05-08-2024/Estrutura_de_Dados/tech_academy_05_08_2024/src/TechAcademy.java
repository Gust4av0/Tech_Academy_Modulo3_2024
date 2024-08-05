public class TechAcademy {
    public static void main(String[] args) {

        //Declaração de variáveis
        String nome = "Gustavo";
        int idade = 19;
        double altura = 1.75;
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);


        //Convertendo para Classe Wrapper
        Integer idadeWrapper = Integer.valueOf(20);
        System.out.println(idadeWrapper);

        int idade2 = idadeWrapper.intValue();
        System.out.println(idade2);
    }
}
