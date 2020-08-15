package aspooaula1;
public class ASPOOaula1 {
public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.idade = 8;
        a1.nome = "gato";
        a1.tamanho = "pequeno";
        a1.tipo = "domestico";
        
        a1.status();
        a1.comer();
        a1.dormir();
    }
    
}
