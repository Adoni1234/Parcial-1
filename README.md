Calculadora Matemática
Este proyecto es una aplicación de consola en Java que implementa una calculadora básica para realizar operaciones matemáticas simples. La aplicación ofrece un menú para que el usuario elija entre las siguientes opciones: establecer valores, sumar, restar, multiplicar, dividir y salir del programa.

Características
Establecer dos números para las operaciones.
Realizar operaciones básicas: suma, resta, multiplicación y división.
Manejo de errores, como la división por cero.
Estructura del proyecto
El proyecto está compuesto por dos clases principales:

CalculadoraMatematica: Clase que implementa la lógica de las operaciones matemáticas.
Prueba: Clase principal que ejecuta la aplicación, mostrando el menú y manejando la interacción con el usuario.
Uso del programa
Cuando se ejecuta el programa, se muestra un menú de opciones en la consola. El usuario debe ingresar el número correspondiente a la operación deseada.

Menú de opciones
markdown
Copy
Edit
=================Operaciones=================
                 1. valores                 
                 2. sumar                   
                 3. resta                   
                 4. multiplicacion          
                 5. division                
                 6. salir                   
=============================================
Ejemplo de flujo de ejecución:
Seleccionar la opción 1 para establecer los valores:
Se le solicitará al usuario que ingrese dos números.

Seleccionar la opción 2 para sumar:
El programa muestra el resultado de la suma de los dos números previamente ingresados.

Seleccionar la opción 6 para salir:
El programa finaliza mostrando un mensaje de despedida.


Clase CalculadoraMatematica:
public class CalculadoraMatematica {
    private double numero1;
    private double numero2;

    public CalculadoraMatematica() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public void establecerNumeros(double num1, double num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public double sumar() {
        return numero1 + numero2;
    }

    public double resta() {
        return numero1 - numero2;
    }

    public double multiplicacion() {
        return numero1 * numero2;
    }

    public double division() {
        if (numero2 == 0) {
            throw new ArithmeticException("Error: division por cero no es valida");
        }
        return numero1 / numero2;
    }
}


Clase Prueba :
public class Prueba {
    public static void main(String[] args) {
        CalculadoraMatematica calculadora = new CalculadoraMatematica();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("=================Operaciones=================");
            System.out.println("                 1. valores                  ");
            System.out.println("                 2. sumar                    ");
            System.out.println("                 3. resta                    ");
            System.out.println("                 4. multiplicacion           ");
            System.out.println("                 5. division                 ");
            System.out.println("                 6. salir                    ");
            System.out.println("=============================================");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese el primer valor:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo valor:");
                    double num2 = scanner.nextDouble();
                    calculadora.establecerNumeros(num1, num2);
                    break;
                case 2:
                    System.out.println("La suma es: " + calculadora.sumar());
                    break;
                case 3:
                    System.out.println("La resta es: " + calculadora.resta());
                    break;
                case 4:
                    System.out.println("La multiplicación es: " + calculadora.multiplicacion());
                    break;
                case 5:
                    try {
                        System.out.println("La división es: " + calculadora.division());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Reintenta nuevamente.");
            }
        } while (option != 6);

        scanner.close();
    }
}
Requisitos:

Java 8 o superior.
Entorno de desarrollo integrado (IDE) como NetBeans, IntelliJ IDEA o Eclipse.
Cómo ejecutar el proyecto
Clona o descarga el repositorio.
Abre el proyecto en tu IDE favorito.
Compila y ejecuta la clase Prueba para iniciar la calculadora

Autor:
adoni
