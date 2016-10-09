package com.coordenadasGeograficas;

/**
 * Creado por JoseJacin on 11/6/16.
 * Curso de Android de EdX
 */
class GeoPuntoAlt extends GeoPunto {
    private double altitud;

    //Declaración de constructor
    /** Contructor del método GeoPuntoAlt.
     * @param latitud Latidud del punto geográfico
     * @param longitud Longitud del punto geográfico
     * @param altitud Altitud del punto geográfico
     */
    public GeoPuntoAlt (double latitud, double longitud, double altitud) {
        super(latitud,longitud);
        this.altitud = (int) (altitud * 1E6);
    }

    /** Contructor del método GeoPuntoAlt.
     * @param latitud Latitud del punto geográfico
     * @param longitud Longitud del punto geográfico
     */
    public GeoPuntoAlt (double latitud, double longitud) {
        super(latitud,longitud);
        this.altitud = (int) (altitud * 1E6);
    }

    //Declaración de métodos
    //Métodos GET
    /** Obtiene el valor del atributo altitud.
     * @return double altitud
     */
    public double getAltitud() {
        return altitud;
    }

    //Métodos SET
    /** Establece el valor del atributo altitud.
     * @param altitud Altitud del punto geográfico
     */
    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    //Otros métodos
    /** Transcribe las coordenadas a String.
     * @return string con las coordenadas conatenadas junto a la altura
     */
    @Override public String toString() { return super.toString() + " Altitud: " + altitud;}

    /** Aproxima la distancia en metros entre dos puntos
     * @return double c
     */
    public double Distancia(GeoPuntoAlt punto) {
        double dalt = altitud - punto.getAltitud();
        double dant = super.Distancia(punto);
        return (Math.sqrt(Math.pow(dant,2) + Math.pow(dalt,2)));
    }
}
