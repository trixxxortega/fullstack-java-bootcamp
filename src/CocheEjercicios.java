public class CocheEjercicios {
    public static void main(String[] args) {

        Coche coche1 = new Coche ();

        System.out.println( " Tengo un coche cuya marca es " + coche1.getMarca() + ", su modelo es " + coche1.getModelo() + ", el anio es " + coche1.getAnio() + ", y su color es " + coche1.getColor());
        coche1.arrancar();
        coche1.detener();

    }
}
