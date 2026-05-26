/**
 * Carro Esportivo - produto concreto
 *
 * @author Natalia
 * @version 1.0
 */
public class CarroEsportivo extends Carro {

    public CarroEsportivo() {
        this.modelo = "Ferrari";
        this.motor = "V8 Turbo";
        this.ano = 2024;
    }

    @Override
    public void exibirInfo() {
        System.out.println("=== CARRO ESPORTIVO ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade máxima: 320 km/h");
    }
}