/**
 * Carro Popular - produto concreto
 *
 * @author Natalia
 * @version 1.0
 */
public class CarroPopular extends Carro {

    public CarroPopular() {
        this.modelo = "Fiat Uno";
        this.motor = "1.0 Fire";
        this.ano = 2024;
    }

    @Override
    public void exibirInfo() {
        System.out.println("=== CARRO POPULAR ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor);
        System.out.println("Ano: " + ano);
        System.out.println("Consumo: 15 km/l");
    }
}