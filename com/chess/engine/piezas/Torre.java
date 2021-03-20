package com.chess.engine.piezas;

import java.util.List;

import com.chess.engine.Color;
import com.chess.engine.tablero.Losa;
import com.chess.engine.tablero.Movimiento;
import com.chess.engine.tablero.Tablero;

public class Torre extends Pieza{

    Torre(final int piezaPosicion, final Color piezaColor) {
        super(piezaPosicion,piezaColor);
    }
    
    /*
    //letraX significa todo movimiento de izquierda a derecha y viceversa
    //NumeroY significa todo movimiento de arriba a abajo y viceversa
    public boolean poderMoverse(int letraX, int NumeroY){



        //Primera condicion para validar si puede moverse al lugar que selecciono, si hay una de nuestro mismo equipo no va a dejar pasarla
        PiezaCoordenada = board.getPieza(letraX,NumeroY);
        if(possible.Pieza!= null){
            if(possible.Pieza.Color == Pieza.Blanco){
                return false;
            }
            if(possible.Pieza.Color == Pieza.Negro){
                return false;
            }
        }


        //Segunda condicion las torres solo pueden moverse en una linea recta
        if(this.getX()!=letraX && this.getY() != NumeroY){
            return false;
        }

        //Tercer condicion saber en que direccion se va a mover
        String direccion="";
        if(NumeroY > this.getY()){
            direccion= "abajo";
        }
        if(NumeroY < this.getY()){
            direccion= "arriba";
        }
        if(letraX > this.getY()){
            direccion= "derecha";
        }
        if(letraX < this.getY()){
            direccion= "izquierda";
        }


        //Cuarta condicion que el campo este desocupado 
        if(direccion.equals("abajo")){
            int espacios_para_mover = Math.abs(NumeroY - this.getY());
            for(int i = 1; i< espacios_para_mover; i++){
                Pieza p =getPieza(this.getX(),this.getY()+i);
                if(p!= null){
                    return false;
                }
            }
        }
        if(direccion.equals("arriba")){
            int espacios_para_mover = Math.abs(NumeroY - this.getY());
            for(int i = 1; i< espacios_para_mover; i++){
                Pieza p =getPieza(this.getX(),this.getY()-i);
                if(p!= null){
                    return false;
                }
            }
        }
        if(direccion.equals("derecha")){
            int espacios_para_mover = Math.abs(letraX - this.getX());
            for(int i = 1; i< espacios_para_mover; i++){
                Pieza p =getPieza(this.getX()+i,this.getY());
                if(p!= null){
                    return false;
                }
            }
        }
        if(direccion.equals("izquierda")){
            int espacios_para_mover = Math.abs(letraX - this.getX());
            for(int i = 1; i< espacios_para_mover; i++){
                Pieza p =getPieza(this.getX()-i,this.getY());
                if(p!= null){
                    return false;
                }
            }
        }





        return true;
    }
*/

    @Override
    public List<Movimiento> calcularMovimientosLegales(Tablero tablero) {
        
        List<Movimiento> calcularMovimientosLegales;

        int proximoLugarMovimiento;

        proximoLugarMovimiento= this.piezaPosicion ;
        
        Losa losaOcupada = LosaOcupada.getPieza(proximoLugarMovimiento);
       
        if(losaOcupada.estadoLosa()){
            
            calcularMovimientosLegales.add(new Movimiento());
        }
        
        
        return null;
    }
}
