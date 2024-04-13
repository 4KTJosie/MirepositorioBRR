import java.util.Scanner;

public class Edificio{
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

        String nom;
        String ape;
        String ced;
        short piso;
        int apa;
        byte edad;
        char gen;


        //entrada
        System.out.println("\nBienvenido a LA 15 PISOS ");
        System.out.println("\nCuál es su nombre?: ");
        nom = j.nextLine();
        System.out.println("Cuál es su apellido?: ");
        ape = j.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = j.nextByte();
        j.nextLine();
        System.out.println("Ingrese su cédula: ");
        ced = j.nextLine();

        do {
            System.out.println("Ingrese su género (masculino[M]/femenino[F]");
            gen = Character.toLowerCase(j.next().charAt(0));
            if (gen != 'm' && gen != 'f') {
                System.out.println("OMBE, pon una M si eres hombre o una F si eres mujer, seriedad por favor..");
            }
        } while (gen != 'm' && gen != 'f');


        do {
            System.out.println("¿A qué piso va? (Ingrese un número entre 1 y 15): ");
            piso = j.nextShort();
            if (piso > 15 || piso < 1) {
                System.out.println("¡El edificio solo tiene 15 pisos! Por favor, ingrese un número de piso válido.");
            }
        } while (piso > 15 || piso < 1);

        int apamin;
        int apamax;

        apamin = (piso - 1) * 10 + 1;
        apamax = piso * 10;


        System.out.println("Usted va hacia el piso " + piso + " ,los apartamentos van del " + apamin + " al " + apamax);

        do {
            System.out.println("Ingrese el número de apartamento al que se dirige: ");
            apa = j.nextInt();
            if (apa < apamin || apa > apamax) {
                System.out.println("El apartamento " + apa + " no está en el piso " + piso);}


        } while (apa < apamin || apa > apamax);

        //salida
        System.out.println("El usuario es: " + nom + " " + ape);
        System.out.println("Tiene " + edad + " años");
        System.out.println("Con cédula de identidad: " + ced);
        if (gen == 'm'){
            System.out.println("Género masculino");}
        else{
            System.out.println("Género femenino");}
        System.out.println("Va al piso " + piso);
        System.out.println("Va al apartamento " + apa);
        if (gen == 'm'){
            System.out.println("\nPuedes pasar, juega vivo por ahí..");}
        else{
            System.out.println("\nAdelante señorita, con cuidado");}
        }


    }