package umg.principal;
import java.util.Scanner;
import umg.principal.Grupo1.AreaCirculo;
import umg.principal.Grupo1.CircuferenciaCirculo;
import umg.principal.Grupo1.VolumenCubo;
import umg.principal.Grupo2.areapiramide;
import umg.principal.Grupo2.areatriangulo;
import umg.principal.Grupo2.volumenpiramide;
import umg.principal.Grupo3.areaparalelogramo;
import umg.principal.Grupo3.volumencilindro;
import umg.principal.Grupo3.volumenprisma;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AreaCirculo areaCirculo = new AreaCirculo();
        CircuferenciaCirculo circuferenciaCirculo = new CircuferenciaCirculo();
        VolumenCubo volumenCubo = new VolumenCubo();
        areapiramide Area = new areapiramide();
        areatriangulo Base = new areatriangulo();
        volumenpiramide Como = new volumenpiramide();
        areaparalelogramo Voy = new areaparalelogramo();
        volumencilindro Hoy = new volumencilindro();
        volumenprisma Kee = new volumenprisma();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            mostrarMenu();


            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la opción 1: Calcular área de un círculo.");
                    areaCirculo.calcularAreaCirculo();

                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción 2: Calcular circunferencia de un círculo.");
                    circuferenciaCirculo.calcularCircunferencia();

                    break;
                case 3:
                    System.out.println("Ha seleccionado la opción 3: Calcular volumen de un cubo.");
                    volumenCubo.calcularVolumen();

                    break;
                    case 4:
                        System.out.println("Ha seleccionado la opción 4: Calcular el area de una piramide cuadrada.");
                        Area.piramide();
                        break;
                        case 5:
                            System.out.println("Ha seleccionado la opción 5:Calcular area de un triangulo .");
                            Base.triangulo();
                            break;
                            case 6:
                                System.out.println("Ha seleccionado la opción 6:Calcular volumen de una piramide cuadrada .");
                                Como.volumen();
                                break;
                                case 7:
                                    System.out.println("Ha seleccionado la opción 7:Calcular area de un paralelogramo .");
                                    Voy.areaparalelo();
                                    break;
                                    case 8:
                                        System.out.println("Ha seleccionado la opción 8:Calcular volumen de un cilindro .");
                                        Hoy.cilindro();
                                        break;
                                        case 9:
                                            System.out.println("Ha seleccionado la opción 9:Calcular volumeN de un prisma .");
                                            Kee.prisma();
                                            break;

                default:
                    System.out.println("Opción no válida. Por favor ingrese un número del 1 al 9.");
            }

            if (opcion != 0) {
                System.out.println("Presione Enter para continuar...");
                scanner.nextLine();
                scanner.nextLine();
            }
    } while(opcion !=0);

        scanner.close();
        System.out.println("Fin del programa nos vemos en la proxima chau uwu");




}





    private static void mostrarMenu() {
        System.out.println("Hola bien venido a menu ");
        System.out.println("Seleccione una opción del 0 al 3:");
        System.out.println("1. Calcular área de un círculo");
        System.out.println("2. Calcular circunferencia de un círculo");
        System.out.println("3. Calcular volumen de un cubo");
        System.out.println("4. Calcular area de una piramide cuadrada.");
        System.out.println("5. Calcular area de un triangulo.");
        System.out.println("6. Calcular volumen de una piramide cuadrada.");
        System.out.println("7. Calcular area de un paralelogramo.");
        System.out.println("8. Calcular volumen de un cilindro.");
        System.out.println("9. Calcular volumeN de un prisma");
        System.out.println("0. Salir del programa");
        System.out.print("Ingrese su opción: ");
    }



    }


