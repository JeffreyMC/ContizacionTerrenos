/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


/**
 *
 * @author jeff
 */
public class Cotizacion {
    
    private int idCotizacion;
    private String fecha;
    private double tamanioLote;
    private boolean contieneConst;
    private double valorConst;
    private int anioConst;
   
    public Cotizacion(int idCotizacion, String fecha, double tamanioLote, boolean contieneConst,
                   double valorConst, int anioConst){
        
        this.idCotizacion = idCotizacion;
        this.fecha = fecha;
        this.tamanioLote = tamanioLote;
        this.contieneConst = contieneConst;
        this.valorConst = valorConst;
        this.anioConst = anioConst;
    }
    
    public Cotizacion(){}
    /**
     * @return the idCotizacion
     */
    public int getIdCotizacion() {
        return idCotizacion;
    }

    /**
     * @param idCotizacion the idCotizacion to set
     */
    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tamanioLote
     */
    public double getTamanioLote() {
        return tamanioLote;
    }

    /**
     * @param tamanioLote the tamanioLote to set
     */
    public void setTamanioLote(double tamanioLote) {
        this.tamanioLote = tamanioLote;
    }

    /**
     * @return the contieneConst
     */
    public boolean getContieneConst() {
        return contieneConst;
    }

    /**
     * @param contieneConst the contieneConst to set
     */
    public void setContieneConst(boolean contieneConst) {
        this.contieneConst = contieneConst;
    }

    /**
     * @return the valorConst
     */
    public double getValorConst() {
        return valorConst;
    }

    /**
     * @param valorConst the valorConst to set
     */
    public void setValorConst(double valorConst) {
        this.valorConst = valorConst;
    }

    /**
     * @return the anioConst
     */
    public int getAnioConst() {
        return anioConst;
    }

    /**
     * @param anioConst the anioConst to set
     */
    public void setAnioConst(int anioConst) {
        this.anioConst = anioConst;
    }

    
}
