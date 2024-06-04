public class Laptop implements IProducto {
    private String modelo;
    private String marca;
    private double precio;
    private int aniosGarantia;

    public Laptop(String modelo, String marca, double precio, int aniosGarantia) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.aniosGarantia = aniosGarantia;
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

    public int getAniosGarantia() {
        return aniosGarantia;
    }

    @Override
    public void imprimeDetallesProducto() {
        System.out.println("Laptop [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", años de garantía=" + aniosGarantia + "]");
    }

    @Override
    public String toString() {
        return "Laptop [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", años de garantía=" + aniosGarantia + "]";
    }
}
