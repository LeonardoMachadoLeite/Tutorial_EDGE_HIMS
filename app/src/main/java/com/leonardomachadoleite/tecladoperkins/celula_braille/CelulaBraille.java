package com.leonardomachadoleite.tecladoperkins.celula_braille;

public class CelulaBraille {

    private final String valorRepresentado;
    private boolean ponto1Preenchido;
    private boolean ponto2Preenchido;
    private boolean ponto3Preenchido;
    private boolean ponto4Preenchido;
    private boolean ponto5Preenchido;
    private boolean ponto6Preenchido;

    public CelulaBraille(boolean ponto1Preenchido, boolean ponto2Preenchido, boolean ponto3Preenchido, boolean ponto4Preenchido,
                         boolean ponto5Preenchido, boolean ponto6Preenchido) {
        this.valorRepresentado = null;
        this.ponto1Preenchido = ponto1Preenchido;
        this.ponto2Preenchido = ponto2Preenchido;
        this.ponto3Preenchido = ponto3Preenchido;
        this.ponto4Preenchido = ponto4Preenchido;
        this.ponto5Preenchido = ponto5Preenchido;
        this.ponto6Preenchido = ponto6Preenchido;
    }
    public CelulaBraille(String valorRepresentado, boolean ponto1Preenchido, boolean ponto2Preenchido, boolean ponto3Preenchido, boolean ponto4Preenchido,
                         boolean ponto5Preenchido, boolean ponto6Preenchido) {
        this.valorRepresentado = valorRepresentado;
        this.ponto1Preenchido = ponto1Preenchido;
        this.ponto2Preenchido = ponto2Preenchido;
        this.ponto3Preenchido = ponto3Preenchido;
        this.ponto4Preenchido = ponto4Preenchido;
        this.ponto5Preenchido = ponto5Preenchido;
        this.ponto6Preenchido = ponto6Preenchido;
    }


}
