
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
public class Staff {
    private String NameOfStaff;
    private final int hourlyRate = 30;
    private int hoursWorked;
    /**
     * Muestra el mensaje de calculando el salario por pantalla.
     */ 
    public void printMessage()
    { 
        System.out.println("Calculando el salario...");
    }
    /**
     * Calcula la paga que le corresponde al trabajador mostrando un mensaje y 
     * multiplicando las horas trabajadas por lo que cobra a la hora el trabajador.
     * @return int las horas trabajas o -1 si no ha trabajado nada.
     */
    public int calculatePay()
    {
        printMessage();
        int staffPay;
        staffPay = hourlyRate * hoursWorked;
        if (hoursWorked > 0)
            return staffPay;
        else
            return -1;
    }
    /**
     * Método sobrecargado del calculatePay que calcula lo que gana el trabajador
     * si además tiene un bonus y una parte fija de dinero.
     * @param bonus int el dinero extra de bonus que gana ese mes.
     * @param allowance int el fijo que le corresponde al trabajador.
     * @return int la paga que le corresponde.
     */
    public int calculatePay(int bonus, int allowance)
    {
        printMessage(); //Para mostrar el mensaje inicial
        if (hoursWorked>0)
            return hoursWorked * hourlyRate + bonus + allowance;
        else
            return 0;
    }
    /**
     * Para establecer las horas trabajadas por el trabajador.
     * @param hours int las horas a establecer.
     */
    public void setHoursWorked(int hours)
    {
        if (hours > 0)
            hoursWorked = hours;
        else {
            System.out.println("-Error: HoursWorked Cannot be Smaller than zero");
            System.out.println("-Error: HoursWorked is not updated");
            }          
    }
    /**
     * Método para obtener las horas trabajadas del empleado.
     * @return int las horas trabajadas.
     */
    public int getHoursWorked()
    {
        return hoursWorked;
    }
    /**
     * Constructor de la clase Staff para generar un nuevo empleado dado el nombre.
     * @param name String el nombre del nuevo trabajador.
     */
    public Staff(String name)
    {
        String nameOfStaff = name;
        System.out.println("\n"+ nameOfStaff);
        System.out.println("-------------------------");
    }
    /**
     * Método sobrecargado del constructor Staff para crear un nuevo empleado 
     * dado el nombre y los apellidos.
     * @param firstName String el nombre del trabajador.
     * @param lastName String los apellidos del trabajador.
     */
    public Staff(String firstName, String lastName)
    {
        String nameOfStaff = firstName + lastName;
        System.out.println("\n"+nameOfStaff);
        System.out.println("-------------------------------");
    }
}