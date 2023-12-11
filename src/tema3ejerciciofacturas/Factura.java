/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3ejerciciofacturas;

/**
 *
 * @author ana
 */
public class Factura {
       private int codigoFactura;
   private int codigoArticulo;
   private double litros;
   private double preciolitro;

    Factura(int codigo, double litros, double precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public int getCodigoFactura(){
    return this.codigoFactura;
    }
    public void setCodigoFactura(int codigoFactura){
        this.codigoFactura=codigoFactura;
        }
   
    public int getCodigoArticulo(){
    return this.codigoArticulo;
    }
    public void setCodigoArticulo(int codigoArticulo){
        this.codigoArticulo=codigoArticulo;
        }
   
    public double getLitros(){
    return this.codigoFactura;
     }
    public void setLitros(double litros){
        this.litros=litros;
    }

    public double getPrecioLitro(){
    return this.preciolitro;
    }
    public void setPrecioLitro(double preciolitro){
        this.preciolitro=preciolitro;
        }
    
    public Factura(){
       
   }
   
    public Factura(int codigoFactura, int codigoArticulo, double litros, double preciolitro){
       this.codigoFactura=codigoFactura;
       this.codigoArticulo=codigoArticulo;
       this.litros=litros;
       this.preciolitro=preciolitro;
   }
    public double totalFactura(){
        return this.litros * this.preciolitro;
    }
        
 @Override
   public String toString(){
        return "El código de factura: "+ this.codigoFactura + ", el código del artículo: " + this.codigoArticulo +
                ", los litros: " +this.litros + "y el precio/litros: "+ this.preciolitro;
   }
}
