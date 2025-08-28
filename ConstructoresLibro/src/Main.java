public class Main {
    public static void main(String[] args) {
        //Objeto con constructor sin parámetros
        Libro libro1 = new Libro();
        // Objeto con constructor con parámetros
        Libro libro2 = new Libro("Romancero Gitano", "Federico Garcí Lorca", 223);

        //Mostrar informción
        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}
