// Clase base
abstract class Vehiculo {
    public double calcularVelocidadMaxima() {
        System.out.println("No implementado");
        return 0;
    }

    public double consumo() {
        System.out.println("No implementado");
        return 0;
    }
}

// Subclase Coche
class Coche extends Vehiculo {
    private int caballos;

    public Coche(int caballos) {
        this.caballos = caballos;
    }

    @Override
    public double calcularVelocidadMaxima() {
        return caballos * 1.5;  // ejemplo simple
    }

    @Override
    public double consumo() {
        return caballos * 0.1;  // ejemplo simple
    }
}

// Subclase Bicicleta
class Bicicleta extends Vehiculo {
    private int numMarchas;

    public Bicicleta(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    @Override
    public double calcularVelocidadMaxima() {
        return numMarchas * 3;  // ejemplo simple
    }

    @Override
    public double consumo() {
        return 0; // no consume combustible
    }
}

// Clase principal (Se podría poner como el Main si se llamase así el archivo pero al ser por ejercicios prefiero hacerlo así)
public class ejercicio1 {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[4];
        vehiculos[0] = new Coche(120);
        vehiculos[1] = new Coche(90);
        vehiculos[2] = new Bicicleta(18);
        vehiculos[3] = new Bicicleta(12);

        for (Vehiculo v : vehiculos) {
            System.out.println("Velocidad máxima: " + v.calcularVelocidadMaxima() + " km/h");
            System.out.println("Consumo: " + v.consumo() + " L/100km");
            System.out.println("--------------[[[[]]]]-------------");
        }
    }
}
