package com.chess.engine.piezas;

import java.util.List;

import com.chess.engine.Alliance;
import com.chess.engine.tablero.Movimiento;
import com.chess.engine.tablero.Tablero;

public abstract class Pieza {

    protected final int piezaPosicion;

    protected final Alliance piezaAlliance;

    Pieza(final int piezaPosicion, final Alliance piezaAlliance) {

        this.piezaAlliance = piezaAlliance;
        this.piezaPosicion = piezaPosicion;

    }

    public abstract List<Movimiento> calcularMovimientosLegales(final Tablero tablero);

}
