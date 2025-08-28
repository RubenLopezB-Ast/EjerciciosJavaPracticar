public class Libro {
    String titulo;
    String autor;
    int paginas;

    // constructor sin parámetros
    public Libro(){
        this.titulo = "Sin título";
        this.autor = "Anónimo";
        this.paginas = 0;
    }
    // constructor con paráetros
    public Libro(String título, String autor, int paginas){
        this.titulo = título;
        this.autor = autor;
        this.paginas = paginas;
    }
    //Metodo para mostrar información
    public void mostrarInfo(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("-------------------");
    }
}
