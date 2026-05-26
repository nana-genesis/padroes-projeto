/**
 * Classe abstrata que representa um Carro.
 *
 * @author Natalia
 * @version 1.0
 */
public abstract class Carro {

    protected String modelo;
    protected String motor;
    protected int ano;

    public abstract void exibirInfo();

    public void ligar() {
        System.out.println("Carro ligado!");
    }
}