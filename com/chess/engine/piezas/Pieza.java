package com.chess.engine.piezas;

import java.util.List;

import com.chess.engine.Color;
import com.chess.engine.tablero.Movimiento;
import com.chess.engine.tablero.Tablero;

public abstract class Pieza {

    protected final int piezaPosicion;

    protected final Color piezaColor;

    Pieza(final int piezaPosicion, final Color piezaColor) {

        this.piezaColor = piezaColor;
        this.piezaPosicion = piezaPosicion;

    }
    public Color getPiezaColor(){
        return this.piezaColor;
    }

    public abstract List<Movimiento> calcularMovimientosLegales(final Tablero tablero);


    
}
