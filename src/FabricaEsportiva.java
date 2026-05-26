/**
 * Fábrica Concreta de Carros Esportivos
 *
 * @author Natalia
 * @version 1.0
 */
public class FabricaEsportiva implements FabricaDeCarro {

    @Override
    public Carro criarCarro() {
        return new CarroEsportivo();
    }
}