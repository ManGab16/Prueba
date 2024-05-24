import java.util.ArrayList;

public class AgenciaViajes {

    private ArrayList<Cliente> clientes;
    private ArrayList<PaqueteTuristico> paquetesTuristicos;
    private ArrayList<Venta> ventas;

    public AgenciaViajes() {
        clientes = new ArrayList<>();
        paquetesTuristicos = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    public boolean buscarCliente(Cliente cliente) {
        boolean flag = false;
        for (Cliente c : clientes) {
            if (cliente.getPasaporte().equals(c.getPasaporte())) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void agregarCliente(Cliente cliente) {
        if (buscarCliente(cliente) != true) {
            clientes.add(cliente);
            System.out.println("Cliente agregado con exito");
        } else {
            System.out.println("El cliente no se puede agregar, ya existe");
        }
    }

    public boolean buscarPaqueteTuristico(PaqueteTuristico paqueteTuristico) {
        boolean flag = false;
        for (PaqueteTuristico p : paquetesTuristicos) {
            if (paqueteTuristico.getNumero() == p.getNumero()) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void agregarPaqueteTuristico(PaqueteTuristico paqueteTuristico) {
        if (!buscarPaqueteTuristico(paqueteTuristico)) {
            paquetesTuristicos.add(paqueteTuristico);
            System.out.println("Paquete Turistico agregado con exito");
        } else {
            System.out.println("El paquete turistico no se puede agregar, ya existe");
        }
    }

    public void eliminarPaqueteTuristico(PaqueteTuristico paqueteTuristico) {
        if (buscarPaqueteTuristico(paqueteTuristico)) {
            paquetesTuristicos.remove(paqueteTuristico);
            System.out.println("Paquete Turístico eliminado con éxito");
        } else {
            System.out.println("El paquete turístico indicado no existe");
        }
    }

    public void mayorCantidadVentasHistorico() {

        int cantidadAventura = 0;
        int cantidadRelax = 0;
        int cantidadCultural = 0;
        PaqueteTuristico mayorPaquete = null;

        for (Venta v : ventas) {
            for (PaqueteTuristico p : v.getPaquetesCliente()) {
                if (p instanceof Aventura) {
                    cantidadAventura = cantidadAventura + p.getCantidad();
                } else if (p instanceof Relax) {
                    cantidadRelax = cantidadRelax + p.getCantidad();
                } else {
                    cantidadCultural = cantidadCultural + p.getCantidad();
                }
            }
        }

       System.out.println("EL numero de ventas de Aventura es: " + cantidadAventura + " de Relax es: " + cantidadRelax + " de Cultura es: " + cantidadCultural);

        cantidadPaquetesTuristicos(cantidadAventura,cantidadRelax,cantidadCultural);
    }

    public void cantidadPaquetesTuristicos(int cantidadAventura, int cantidadRelax, int cantidadCultural) {
        String maximoPaquete=null;
        if (cantidadAventura > cantidadRelax && cantidadAventura > cantidadCultural) {
            maximoPaquete="Aventura";
        } else if (cantidadRelax > cantidadAventura && cantidadRelax > cantidadCultural) {
            maximoPaquete="Relax";
        } else {
            maximoPaquete= "Cultural";
        }

       mostrarPaqueteMasVendido(maximoPaquete);
    }

    public void mostrarPaqueteMasVendido(String tipoPaquete) {
        for (Venta ve : ventas) {
            for (PaqueteTuristico pt : ve.getPaquetesCliente()) {
                if ((tipoPaquete.equalsIgnoreCase("Aventura")) && (pt instanceof Aventura)) {
                    System.out.println(pt.toString());
                } else if ((tipoPaquete.equalsIgnoreCase("Relax")) && (pt instanceof Relax)) {
                    System.out.println(pt.toString());
                } else {
                    if (pt instanceof Relax){
                        System.out.println(pt.toString());
                    }

                }
            }
        }
    }

    public void aumentarPaqueteTuristico(int porcentaje, String tipoPaquete){
        double aumento = 1+(double)porcentaje/100;
        for (PaqueteTuristico p: paquetesTuristicos){
            if ((tipoPaquete.equalsIgnoreCase("Aventura")) && (p instanceof Aventura)) {
                System.out.println(p.toString()+" Precio con aumento: "+ (p.precioTotal()*aumento));
            }

        }
    }

    public String mostrarClientes() {
        return "AgenciaViajes{" +
                "clientes=" + clientes.toString() +
                '}';
    }



    public String mostrarPaquetesTuristicos() {
        return "AgenciaViajes{" +
                "paquetesTuristicos=" + paquetesTuristicos.toString() +
                '}';
    }


    public String mostrarVentas() {
        return "AgenciaViajes{" +
                "ventas=" + ventas.toString() +
                '}';
    }
}
