package aspooaula1;
public class Animal {
    int idade;
    String nome;
    String tamanho;
    String tipo;
    
    void status(){
        System.out.println("Nome do Animal: " + this.nome);
        System.out.println("Idade " + this.idade);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Tamanho: " + this.tamanho);
        
    }
    
    void comer(){
        System.out.println("O " + this.nome + " esta comendo");
    }
    
    void andar(){
        System.out.println("O " + this.nome + " esta andando");
    }
    
    void dormir(){
        System.out.println("O " + this.nome + " esta dormindo");
    }
}
