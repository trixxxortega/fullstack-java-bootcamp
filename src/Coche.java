
public class Coche {
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    Coche(){
        marca = "Peugeot";
        modelo= "308";
        anio= 2015;
        color= "negro";
        }
    Coche(String marca, String modelo, int anio, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public void arrancar(){
        System.out.println("El coche está arrancando");
    }

    public void detener(){
        System.out.println("El coche se ha detenido");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static void main(String[] args) {

        Coche coche1 = new Coche();

        System.out.println( " Tengo un coche cuya marca es " + coche1.getMarca() + ", su modelo es " + coche1.getModelo() + ", el anio es " + coche1.getAnio() + ", y su color es " + coche1.getColor());
        coche1.arrancar();
        coche1.detener();

    }

}