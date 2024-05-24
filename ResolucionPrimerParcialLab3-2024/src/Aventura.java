public class Aventura extends PaqueteTuristico implements Seguro{

    private String actividad;
    private final float KAYAK=50;
    private final float SENDERISMO=40;
    public Aventura() {
    }

    public Aventura(String destino, int stock, int duracion, String actividad) {
        super(destino, stock, duracion);
        setActividad(actividad);
    }

    @Override
    public double precioTotal() {
        double precio=0;

        if (actividad.equalsIgnoreCase("kayak")){
            precio = (super.getPrecioUnitario()+this.KAYAK);
        } else if (actividad.equalsIgnoreCase("senderismo")){
            precio=(super.getPrecioUnitario() + this.SENDERISMO);
        }

        return porcentajeSeguro()*precio;
    }

    public String getActividad() {
        return actividad;
    }


    public void setActividad(String actividad) {
        if (actividad.equalsIgnoreCase("kayak")||actividad.equalsIgnoreCase("senderismo")) {
            this.actividad = actividad;
        } else {
            System.out.println("La actividad ingresada es incorrecta");
            this.actividad=null;

        }
    }

    @Override
    public String toString() {
        return "\n      Paquete Turístico {" + super.toString()+
                "; Tipo Aventura, actividad='" + actividad + '\'' +
                ", precio total="+ precioTotal()+
                '}';
    }

    @Override
    public double porcentajeSeguro() {

        return  1 + (double) SEGURO/100;
    }
}
