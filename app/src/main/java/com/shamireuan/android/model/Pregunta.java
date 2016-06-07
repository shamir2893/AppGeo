package com.shamireuan.android.model;

/**
 * Created by Shamir2893 on 29/02/2016.
 */

public class Pregunta {
    private int mIdResTexto;
    private boolean mRespuestaVerdadera;


    public Pregunta(int mIdResTexto, boolean mRespuestaVerdadera) {
        this.mIdResTexto = mIdResTexto;
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }

    public void setmIdResTexto(int mIdResTexto) {
        this.mIdResTexto = mIdResTexto;
    }

    public int getmIdResTexto() {
        return mIdResTexto;
    }

    public void setmRespuestaVerdadera (boolean mRespuestaVerdadera) {
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }

    public boolean ismRespuestaVerdadera() {
        return mRespuestaVerdadera;
    }

}
