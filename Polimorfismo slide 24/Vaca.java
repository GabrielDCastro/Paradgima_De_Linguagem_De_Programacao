package plp;

/**
 *
 * @author gabri
 */
public class Vaca extends Animal {

    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("A vaca que tem " +numeroPatas +" patas, faz MUUUU");
    }
        
  
}
