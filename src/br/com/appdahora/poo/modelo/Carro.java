package br.com.appdahora.poo.modelo;

public class Carro {
    private boolean ligado;
    private int velocidade;
    private String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
        System.out.print("Carro "+modelo+" criado com sucesso!\n");
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar(){
        if(!ligado){
            System.out.print("Ligue o carro antes\n");
            return;
        }
        if(velocidade>=100){
            System.out.print("Velocidade máxima atingida\n");
            return;
        }
        velocidade+=20;
        mostraVelocidade();
    }
    public void frear(){
        if(velocidade<=0){
            System.out.print("O carro está parado\n");
            return;
        }
        velocidade-=20;
        mostraVelocidade();
    }
    public void mostraVelocidade(){
        System.out.print("Velocidade: "+ velocidade+" \n");
    }
    public void ligar(){
        if(ligado){
            System.out.print("Carro já está ligado\n");
            return;
        }
        System.out.print("Carro ligado\n");
        ligado = true;
    }
    public void desligar(){
        if(!ligado){
            System.out.print("O carro já está desligado\n");
            return;
        }
        System.out.print("Carro desligado\n");
        ligado = false;
    }
    public void mostraMensagem(){
        System.out.print("Eu sou um carro, o "+modelo+" \n");
    }

}
