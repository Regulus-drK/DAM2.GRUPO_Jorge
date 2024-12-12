import java.util.Scanner;

public class EjecutarCalculadora {
    public static void main(String[] args) {
        System.out.println("Iniciando Calculadora ...");
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        while (opcion > 0) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Raíz Cuadrada");
            System.out.println("6. Porcentaje");
            System.out.println("7. Resto");
            System.out.println("0. Salir");

            System.out.print("\nSelecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingresa el primer número: ");
                    int num1 = sc.nextInt();
                    System.out.print("Ingresa el segundo número: ");
                    int num2 = sc.nextInt();
                    System.out.println("Resultado: " + Calculadora.sumar(num1, num2));
                }
                case 2 -> {
                    System.out.print("Ingresa el primer número: ");
                    int num1 = sc.nextInt();
                    System.out.print("Ingresa el segundo número: ");
                    int num2 = sc.nextInt();
                    System.out.println("Resultado: " + Calculadora.restar(num1, num2));
                }
                case 3 -> {
                    System.out.print("Ingresa el primer número: ");
                    int num1 = sc.nextInt();
                    System.out.print("Ingresa el segundo número: ");
                    int num2 = sc.nextInt();
                    System.out.println("Resultado: " + Calculadora.multiplicar(num1, num2));
                }
                case 4 -> {
                    System.out.print("Ingresa el primer número: ");
                    int num1 = sc.nextInt();
                    System.out.print("Ingresa el segundo número: ");
                    int num2 = sc.nextInt();
                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir entre cero.");
                    } else {
                        System.out.println("Resultado: " + Calculadora.division(num1, num2));
                    }
                }
                case 5 -> {
                    System.out.print("Ingresa un número (debe ser mayor o igual a 0): ");
                    double numero = sc.nextDouble();
                    if (numero < 0) {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    } else {
                        System.out.println("Resultado: " + Calculadora.raizCuadrada(numero));
                    }
                }
                case 6 -> {
                    System.out.print("Ingresa un número (debe ser mayor o igual a 0): ");
                    double num1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double num2 = sc.nextDouble();
                    if (numero <= 0) {
                        System.out.println("Error: No se puede calcular el porcentaje de un número negativo.");
                    } else {
                        System.out.println("Resultado: " + Calculadora.porcentaje(numero));
                    }
                }
                case 7 -> {
                    System.out.print("Ingresa un número (debe ser mayor o igual a 0): ");
                    double num1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double num2 = sc.nextDouble();
                    if (numero <= 0) {
                        System.out.println("Error: No se puede calcular el resto de un número negativo.");
                    } else {
                        System.out.println("Resultado: " + Calculadora.resto(numero));
                    }
                }
                case 0 -> System.out.println("Saliendo del programa ...");
                default -> System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }
        }

        sc.close();
    }
}
