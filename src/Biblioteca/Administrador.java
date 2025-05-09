package Biblioteca;

import java.util.ArrayList;

public class Administrador extends Usuario{
    private ArrayList<Libro>libros;
    private ArrayList<Cliente>clientes;
    private ArrayList<Prestamo>prestamos;
    public Administrador(int id, String nombre, String correo) {
        super(id, nombre, correo);
        this.clientes=new ArrayList<>();
        this.libros=new ArrayList<>();
        this.prestamos=new ArrayList<>();
    }
    public void registrarCliente(ArrayList<Cliente>clientes){
        for (Cliente c:clientes){
            this.clientes.add(c);
            System.out.println("clientes registrados: " + "id:"+c.getId());
            System.out.println("nombre"+c.getNombre());
            System.out.println("correo"+c.getCorreo());
        }
    }
    public void registrarLibro(ArrayList<Libro>libros){
        for (Libro l: libros){
            this.libros.add(l);
            System.out.println("ISBN: " + l.getIsbn());
            System.out.println("Título: " + l.getTitulo());
            System.out.println("Autor: "+l.getAutor());
            System.out.println("Estado:"+l.isDisponible());
        }
    }
    public void realizarPrestamo (Prestamo prestamo) {
        System.out.println("fecha del prestamo: " + prestamo.getFechaInicio());
        System.out.println("fecha de devolucion: "  + prestamo.getFechaDevolucion());
        System.out.println("estado del prestamo: "+ prestamo.getEstado());
    }

}