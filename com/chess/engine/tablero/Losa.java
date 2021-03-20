package com.chess.engine.tablero;

import java.util.HashMap;
import java.util.Map;

import com.chess.engine.piezas.Pieza;

public abstract class Losa {

    protected final int losaCoordenada;

    private static final Map<Integer, LosaVacia> LOSAS_VACIAS_CACHE = crearTodaLosaVaciaPosible();

    private static Map<Integer, LosaVacia> crearTodaLosaVaciaPosible() {

        final Map<Integer, LosaVacia> mapaLosaVacia = new HashMap<>();

        for (int i = 0; i < 64; i++) {

            mapaLosaVacia.put(i, new LosaVacia(i));

        }

        return mapaLosaVacia;
    }

    public static Losa crearLosa(final int losaCoordenada, final Pieza pieza) {

        return pieza != null ? new LosaOcupada(losaCoordenada, pieza) : LOSAS_VACIAS_CACHE.get(losaCoordenada);

    }

    private Losa(int losaCoordenada) {

        this.losaCoordenada = losaCoordenada;

    }

    public abstract boolean estadoLosa();

    public abstract Pieza tomarPieza();

    public static final class LosaVacia extends Losa {

        private LosaVacia(final int coordenada) {

            super(coordenada);

        }

        @Override
        public boolean estadoLosa() {

            return false;

        }

        @Override
        public Pieza tomarPieza() {

            return null;

        }

    }

    public static final class LosaOcupada extends Losa {

        private final Pieza piezaEnLosa;

        private LosaOcupada(int losaCoordenada, Pieza piezaEnLosa) {

            super(losaCoordenada);
            this.piezaEnLosa = piezaEnLosa;

        }

        @Override
        public boolean estadoLosa() {

            return true;

        }

        @Override
        public Pieza tomarPieza() {
            return this.piezaEnLosa;

        }

    }

}