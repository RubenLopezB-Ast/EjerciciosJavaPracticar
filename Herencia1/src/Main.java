public class Main {
    public static void main(String[] args) {

        Usuario user = new Usuario("PEPE","pepe@gmail.com");
        Usuario admin = new Administrador("María","maria@gmail.com","ALTO");
        Usuario cli = new Cliente("Juan","juan@gmail.com",50);

        Usuario[] usuarios = {user, admin, cli};

        for (Usuario U : usuarios){
            U.mostrarInfo();
        }
    }
}
