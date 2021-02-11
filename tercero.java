import java.util.Scanner;
public class tercero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.println("Escriba su nombre: ");
        nombre = sc.nextLine();

        System.out.println("Su nombre es " + nombre);
            
        sc.close();
    }
}