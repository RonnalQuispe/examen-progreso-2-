public class Tablet implements IProducto {
    private String modelo;
    private String marca;
    private double precio;

    public Tablet(String modelo, String marca, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void imprimeDetallesProducto() {
        System.out.println("Tablet [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + "]");
    }

    @Override
    public String toString() {
        return "Tablet [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + "]";
    }
}
