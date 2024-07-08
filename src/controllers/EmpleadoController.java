package controllers;

import java.util.HashMap;

import models.Empleado;

public class EmpleadoController {
private HashMap<Integer, Empleado> empleados;

    public EmpleadoController() {
        empleados = new HashMap<>();
    }
    public void addEmpleado(Empleado empleado){
        empleados.put(empleado.getId(), empleado);
    }
    public Empleado getEmpleado(int id){
        return empleados.get(id);
    }
    public void imprimirEmpleados(){
        //System.out.println(empleados);
        for(Empleado emp  : empleados.values()){
            System.out.println(emp);
        }
    }
}
