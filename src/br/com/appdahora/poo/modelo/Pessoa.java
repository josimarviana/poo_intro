package br.com.appdahora.poo.modelo;

public class Pessoa {
    private String nome;
    private int idade;
    private boolean habilitada;
    private Carro carro;

    public Pessoa(String nome){
        this.nome = nome;
        System.out.print("Pessoa "+nome+" criada com sucesso!\n");
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        if(idade<18) {
            this.habilitada = false;
            System.out.print(nome + " não tem idade suficiente para ter habilitação\n");
            return;
        }
            this.habilitada = habilitada;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
        System.out.print("Pessoa "+nome+" ganhou um carro "+carro.getModelo()+"!\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void falar(String palavras){
        System.out.print(nome+ " falando: "+palavras);
    }

    public void caminhar(){
        System.out.print(nome+ " caminhando\n");
    }

    public void passear() {
        System.out.print(nome + " vai passear\n");
        if (carro == null) {
            System.out.print(nome + " não tem carro\n");
            caminhar();
        } else if (!habilitada) {
            System.out.print(nome + " tem carro mas não tem habilitação\n");
            caminhar();
        } else {
            carro.ligar();
            carro.acelerar();
            carro.acelerar();
            carro.frear();
            carro.frear();
            carro.desligar();
        }
    }
}
