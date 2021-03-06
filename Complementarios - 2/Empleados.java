public class Empleados {
    private Integer dni;
    private Integer horasTrabajadas;
    private Integer valorPorHora;

    public Empleados(String nombreYApellido, Integer dni, Integer horasTrabajadas, Integer valorPorHora) {
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public Integer getDni() {
        return dni;
    }

    public Integer getSueldo(){
        return this.horasTrabajadas * this.valorPorHora;
    }
}