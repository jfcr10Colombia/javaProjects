//package reto2;

public class Doctor extends Empleado 
{
    protected String especialidad;   
    public Doctor(String nombre, String tipoContrato, int salario,String especialidad) 
    {
        super(nombre, tipoContrato, salario);        
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
