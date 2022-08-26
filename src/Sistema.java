import br.com.appdahora.poo.modelo.*;
public class Sistema {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Camila", 20);
        pessoa.passear();
        Carro carro = new Carro("fuscão");
        pessoa.setCarro(carro);
        pessoa.setHabilitada(true);
        pessoa.passear();
    }
}
