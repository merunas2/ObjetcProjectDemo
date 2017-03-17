
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetcprojectdemo;

/**
 * Clase de un empleado.
 * @author alumno
 */
public class Empleado {
    private String nombreEmpleado;
    private final int precioHora = 30;
    private int horasTrabajadas;
    /**
     * Muestra el mensaje de calculando el salario por pantalla.
     */ 
    public void mostrarMensaje()
    { 
        System.out.println("Calculando el salario...");
    }
    /**
     * Calcula la paga que le corresponde al trabajador mostrando un mensaje y 
     * multiplicando las horas trabajadas por lo que cobra a la hora el trabajador.
     * @return int las horas trabajas o -1 si no ha trabajado nada.
     */
    public int calcularPago()
    {
        mostrarMensaje();
        int pagaEmpleado;
        pagaEmpleado = precioHora * horasTrabajadas;
        if (horasTrabajadas > 0)
            return pagaEmpleado;
        else
            return -1;
    }
    /**
     * Método sobrecargado del calcularPago que calcula lo que gana el trabajador
 si además tiene un bonus y una parte fija de dinero.
     * @param bonus int el dinero extra de bonus que gana ese mes.
     * @param fijo int el fijo que le corresponde al trabajador.
     * @return int la paga que le corresponde.
     */
    public int calcularPago(int bonus, int fijo)
    {
        mostrarMensaje(); //Para mostrar el mensaje inicial
        if (horasTrabajadas>0)
            return horasTrabajadas * precioHora + bonus + fijo;
        else
            return 0;
    }
    /**
     * Para establecer las horas trabajadas por el trabajador.
     * @param horas int las horas a establecer.
     */
    public void setHorasTrabajadas(int horas)
    {
        if (horas > 0)
            horasTrabajadas = horas;
        else {
            System.out.println("-Error: HoursWorked Cannot be Smaller than zero");
            System.out.println("-Error: HoursWorked is not updated");
            }          
    }
    /**
     * Método para obtener las horas trabajadas del empleado.
     * @return int las horas trabajadas.
     */
    public int getHorasTrabajadas()
    {
        return horasTrabajadas;
    }
    /**
     * Constructor de la clase Staff para generar un nuevo empleado dado el nombre.
     * @param nombre String el nombre del nuevo trabajador.
     */
    public Empleado(String nombre)
    {
        String nombreEmpleado = nombre;
        System.out.println("\n"+ nombreEmpleado);
        System.out.println("-------------------------");
    }
    /**
     * Método sobrecargado del constructor Staff para crear un nuevo empleado 
     * dado el nombre y los apellidos.
     * @param nombre String el nombre del trabajador.
     * @param apellido String los apellidos del trabajador.
     */
    public Empleado(String nombre, String apellido)
    {
        String nameOfStaff = nombre + apellido;
        System.out.println("\n"+nameOfStaff);
        System.out.println("-------------------------------");
    }
}