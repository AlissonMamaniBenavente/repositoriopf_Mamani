package prueba;

import java.util.Scanner;

public class Prueba1 {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        // Solicitar tres compras
        System.out.print("Ingrese el monto de la primera compra: ");
        double compra1 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la segunda compra: ");
        double compra2 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la tercera compra: ");
        double compra3 = scanner.nextDouble();

        // Calcular total y promedio
        double totalCompras = compra1 + compra2 + compra3;
        double promedioCompras = totalCompras / 3;

        // Mostrar resultados
        System.out.println("\n--- RESUMEN DE COMPRAS ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Total de compras: S/ " + totalCompras);
        System.out.println("Promedio de compras: S/ " + promedioCompras);
      
        
        
    }
    
}
