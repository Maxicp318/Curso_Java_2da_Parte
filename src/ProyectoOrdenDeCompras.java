import java.util.Date;

public class ProyectoOrdenDeCompras {
    public static void main(String[] args) {

        OrdenCompra orden1 = new OrdenCompra("Compra de sistema de audio");
        orden1.setCliente(new Cliente("Maxi", "Perez"));
        orden1.setFecha(new Date());
        orden1.addProducto(new Producto("Sony", "Bafle 15 pulgada", 20000));
        orden1.addProducto(new Producto("LG", "Torre de sonido", 100000));
        orden1.addProducto(new Producto("Philip", "Estereo", 59000));
        orden1.addProducto(new Producto("LG", "Equipo xboom", 250000));

        OrdenCompra orden2 = new OrdenCompra("Compras Electrodomésticos");
        orden2.setCliente(new Cliente("John", "Mircha"));
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("Liliana", "Cocina", 239990));
        orden2.addProducto(new Producto("Samsung", "Refrigerador", 429990));
        orden2.addProducto(new Producto("Midea", "Lavadora", 149990));
        orden2.addProducto(new Producto("Aspiradora", "IRobot", 199990));

        OrdenCompra orden3 = new OrdenCompra("Compras materiales de construcción");
        orden3.setCliente(new Cliente("Pepe", "Rojel"));
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Minetti", "Cemento 25kg", 4870));
        orden3.addProducto(new Producto("Holcim", "Hormigon", 6040));
        orden3.addProducto(new Producto("Ceramicas Santiago", "Ladrillo", 790));
        orden3.addProducto(new Producto("Redline", "Escala articulada aluminio", 48990));

        OrdenCompra[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompra orden : ordenes) {
            System.out.println("Orden N°: " + orden.getIdentificador());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.getGranTotal());

            int i = 1;
            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre()
                        + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------- siguiente -----------------------------");
        }
    }
}
