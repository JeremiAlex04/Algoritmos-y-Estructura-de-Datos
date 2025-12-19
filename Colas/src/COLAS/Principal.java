package COLAS;

public class Principal {

    public static void main(String[] args) {

        Cola C = new Cola(5);
        System.out.println("INICAR COLA");

        C.agregar(10);
        C.agregar(20);
        C.agregar(50);
        C.eliminar();
        C.mostrarCola();
        
        System.out.println("Cantidad de datos en cola: " + C.EnCola());

        if (C.estaLlenaCola() == true) {
            System.out.println("cola llena");
        } else {
            System.out.println("cola por llenar");
        }

        if (C.estaVaciaCola() == true) {
            System.out.println("cola vacia");
        } else {
            System.out.println("cola no vacia");
        }

    }

}
