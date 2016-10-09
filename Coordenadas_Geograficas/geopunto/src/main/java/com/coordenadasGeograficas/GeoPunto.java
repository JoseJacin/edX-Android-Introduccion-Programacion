package com.coordenadasGeograficas;

public class GeoPunto {
    //Declaración de atributos
    public double longitud, latitud;

    //Declaración de constructor
    /** Constructor del método GeoPunto.
     */
    public GeoPunto (double latitud, double longitud) {
        this.latitud = (int) (latitud * 1E6);
        this.longitud = (int) (longitud * 1E6);
    }

    //Declaración de métodos
    //Métodos GET
    /** Obtiene el valor del atributo longitud
     * @return double longitud
     */
    public double getLongitud() {
        return longitud;
    }

    /** Obtiene el valor del atributo latitud
     * @return double latitud
     */
    public double getLatitud() {
        return latitud;
    }

    //Métodos SET
    /** Establece el valor del atributo logitud
     * @param longitud Valor del parámetro longitud
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /** Establece el valor del atributo latitud
     * @param latitud Valor del parámetro latitud
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    //Otros métodos
    /** Transcribe las coordenadas a String.
     * @returnnum string con las coordenadas conatenadas
     */
    public String toString () {
        return latitud + "+" + longitud;
    }

    /** Aproxima la distancia en metros entre dos puntos
     * @return double c
     */
    public double Distancia (GeoPunto punto) {
        final double RADIO_TIERRA = 6371000; // en metros
        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a =    Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.sin(dLon/2) * Math.sin(dLon/2) *
                        Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c * RADIO_TIERRA;
    }
}
