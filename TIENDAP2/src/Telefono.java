public class Telefono implements IProducto {
    private String modelo;
    private String marca;
    private double precio;

    public Telefono(String modelo, String marca, double precio) {
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
        System.out.println("Telefono [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + "]");
    }

    @Override
    public String toString() {
        return "Telefono [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + "]";
    }
}
