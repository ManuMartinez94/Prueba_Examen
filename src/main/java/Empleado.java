/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel Martínez Parreño
 * @author <a href="manumony1@gmail.com"> manumony1@gmail.com </a>
 * @version 1.1
 * 
 */
public class Empleado {
    /**
     * Nombre del empleado
     */
  private String nombre;
  /**
   * Apellido del empleado
   */
  private String apellido;
  /**
   * Edad del empleado
   */
  private int edad;
  /**
   * Salario del empleado
   */
  private double salario;
  
  //Metodos publicos
  /**
   * Le suma un plus al salario del empleadio si tiene más de 40 años
   * @param sueldoPlus cantidad de euros que se le suma al empleado
   * @return <ul>
   * <li>true=se le suma al empleado el plus</li>
   * <li> false=no se le suma el plus</li>
   * </ul>
   */
  public boolean plus (double sueldoPlus){
    boolean aumento=false;
    if (edad>40 && compruebaNombre()){
        salario+=sueldoPlus;
        aumento=true;
    }
    return aumento;
  }
  
  //Metodos privados
  /**
   * Comprueba si el nombre introducido es igual que el real
   * @return <ul>
   * <li>true=el nombre es el tuyo</li>
   * <li> false=no es tu nombre</li>
   * </ul>
   */
  private boolean compruebaNombre(){
    if(nombre.equals("")){
        return false;
    }
    return true;
  }
 
  //Constructores
  /**
   * Constructor por defecto
   */
  public Empleado(){
    this ("", "", 0, 0);
  }
   /**
    * Constructor con 4 parámetros
    * @param nombre nombre del empleado
    * @param apellido apellido del empleado
    * @param edad edad del empleado
    * @param salario salario del empleado
    */
  public Empleado(String nombre, String apellido, int edad, double salario){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.salario=salario;
  }
   
}
