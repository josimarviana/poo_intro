import br.com.appdahora.poo.modelo.*;
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Camila", 20);
        pessoa.passear();
        Carro carro = new Carro("fuscão");
        pessoa.setCarro(carro);
        System.out.println("O dono do carro eh: "+carro.getDono().getNome());
        pessoa.setHabilitada(true);
        pessoa.passear();
    }
}
