/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;

/**
 * Clase que manejara las cuentas bancarias de un usuario o entidad.
 * @author elias
 * @version 1.1.1
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        
        

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1, 0.0F);
    }
    /**
     * 
     * Metodo para operar con una cuenta bancaria
     * @param cuenta1 Objeto que determina el numero de cuenta con el que se va a operar.
     * @param cantidad Cantidad de dinero con el que vamos a operar en la cuenta bancaria.
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual;
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

