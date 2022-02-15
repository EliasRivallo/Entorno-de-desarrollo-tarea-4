/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;

/**
 * Clase con los metodos que se usaran en la cuenta corriente.
 *@version 1.1.1
 * @author elias
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constriuctor de el objeto CCuenta por defecto con valores a cero
     */
    
    public CCuenta()
    {
    }
    
    /**
     * Crea un objeto de clase, a partir de los atributos establecidos.
     * @param nom Nombre del usuario que la va a usar.
     * @param cue Numero de la cuenta bancaria.
     * @param sal Saldo del que dispone la cuenta corriente.
     * @param tipo Tipo de cuenta corriente.
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Calculo del saldo que disopnemos de la cuenta
     * @return Valor de el saldo que dispone la cuenta.
     */
    
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Metodo para ingresar dinero en la cuenta bancaria
     * @param cantidad Cantidad que ingresaremos en la cuenta bancaria
     * @throws Exception Excepcion que lanzaremos si la cantidad a ingresar es negativa.
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Cantidad de dinero que desearemos sacar de la cuenta bancaria.
     * @param cantidad Valor que se quiere retirar de la cuenta corriente.
     * @throws Exception Mensaje que se lanza en el caso de querer sacar mas dinero de que dispone la cuenta,
     * o introducir un valor negativo.
     */
    
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
