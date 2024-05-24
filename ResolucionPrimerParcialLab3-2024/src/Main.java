public class Main {
    public static void main(String[] args) {

        ///AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA//

        // Creando agencia
        AgenciaViajes travelFan=new AgenciaViajes();

        // creando paquetes turisticos
        PaqueteTuristico aventura1= new Aventura("playa",10,7,"kayak");
        PaqueteTuristico aventura2= new Aventura("montania",20,5,"senderismo");
        PaqueteTuristico aventura3= new Aventura("montania",20,5,"senderismo");
        PaqueteTuristico aventura4= new Aventura("montana",20,5,"senderiso");

        PaqueteTuristico relax1= new Relax("playa",15,10,"hidromasajes");
        PaqueteTuristico relax2= new Relax("montania",25,8,"banios de barro");
        PaqueteTuristico relax3= new Relax("montania",25,8,"banios barro");

        PaqueteTuristico cultural1= new Cultural("playa",8,12,10);
        PaqueteTuristico cultural2= new Cultural("montania",12,8,6);
        PaqueteTuristico cultural3= new Cultural("montania",12,8,6);

        // Mostrando los paquetes creados
        /*
        System.out.println(aventura1.toString());
        System.out.println(aventura2.toString());
        System.out.println(relax1.toString());
        System.out.println(relax2.toString());
        System.out.println(cultural1.toString());
        System.out.println(cultural2.toString());
        */

        // Agregando Paquetes Turísticos a la agencia
        travelFan.agregarPaqueteTuristico(aventura1);
        travelFan.agregarPaqueteTuristico(aventura2);
        travelFan.agregarPaqueteTuristico(relax1);
        travelFan.agregarPaqueteTuristico(relax2);
        travelFan.agregarPaqueteTuristico(cultural1);
        travelFan.agregarPaqueteTuristico(cultural2);

        // Muestra paquetes turísticos agregados
        System.out.println( travelFan.mostrarPaquetesTuristicos());


        // Creando Clientes
        Cliente persona1=new Cliente("Lionel","Messi","123456");
        Cliente persona2=new Cliente("Juan Roman","Riquelme","456789");
        Cliente persona3=new Cliente("Edinson","Cavani","147258");

        // Agregando clientes a la agencia
        travelFan.agregarCliente(persona1);
        travelFan.agregarCliente(persona2);
        travelFan.agregarCliente(persona3);

        // Mostrando clientes agregados
        System.out.println( travelFan.mostrarClientes());

        /// EJERCICIO 3

        // Creando Ventas
        Venta venta1=new Venta("30/01/2023",persona1);
        Venta venta2=new Venta("20/09/2022",persona2);
        Venta venta3=new Venta("25/4/2024",persona3);


        // Agregando paquetes a la venta de un cliente
        venta1.agregarPaqueteCliente(2,aventura1);
        venta1.agregarPaqueteCliente(30,relax1);
        venta1.agregarPaqueteCliente(7,cultural2);

        venta2.agregarPaqueteCliente(2,relax2);

        venta3.agregarPaqueteCliente(2,aventura2);
        venta3.agregarPaqueteCliente(4,relax1);


        //Agregando Ventas a la Agencia
        travelFan.agregarVenta(venta1);
        travelFan.agregarVenta(venta2);
        travelFan.agregarVenta(venta3);

        // Mostrando ventas
        System.out.println(travelFan.mostrarVentas());

        /// EJERCICIO 4

        // Eliminar un paquete trurístico
        travelFan.eliminarPaqueteTuristico(cultural2);

        // Muestra paquetes turístico
        System.out.println(travelFan.mostrarPaquetesTuristicos());

        /// EJERCICIO 5
        travelFan.mayorCantidadVentasHistorico();

        /// EJERCICIO 6

        // Aumentar el preciode los paquetes turisticos de aventura un 10%

        travelFan.aumentarPaqueteTuristico(10,"Aventura");

    }
}