package plp;

/**
 *
 * @author gabri
 */
public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O gato que tem " +numeroPatas +" patas, faz MIAU");
    }
    
}
