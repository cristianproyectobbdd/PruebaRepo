/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3ejerciciofacturas;

import java.util.Scanner;

/**
 *
 * @author ana
 */
public class FacturaEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    final int numFact = 0;
       int cont600=0;
       double fact=0, litrosA1=0;
       FacturaEmpresa Factura;
       for(int i=1; i<=numFact; i++){
        Factura miFactura = crearFactura();
            fact+= miFactura.totalFactura();
            if(miFactura.getCodigoArticulo()==1)
                litrosA1+=miFactura.getLitros();
            if(miFactura.totalFactura()>=600)
                cont600++;
            
        }
        
        System.out.printf("\nFacturación total: %.2f",fact);
        System.out.printf("\nLitros artículo 1: %.2f",litrosA1);
        System.out.printf("\nFacturas de más de 600€: %d\n",cont600);
        
        
        
     }
     
     public static Factura crearFactura(){
          Scanner entrada = new Scanner(System.in);
          double litros, precio;
          Factura miFactura;
          int codigo;
          System.out.printf("\nFactura :");
            System.out.printf("\nCódigo  artículo: ");
            codigo=entrada.nextInt();
            System.out.printf("\nCantidad en litros: ");
            litros=entrada.nextDouble();
            System.out.printf("\nPrecio por litro: ");
            precio=entrada.nextDouble();
             miFactura= new Factura(codigo, litros, precio);
             return miFactura;
     }
    
}
