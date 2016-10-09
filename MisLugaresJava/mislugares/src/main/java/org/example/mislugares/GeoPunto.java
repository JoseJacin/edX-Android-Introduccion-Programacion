package org.example.mislugares;

public class GeoPunto {
    //Declaración de atributos
    public double longitud, latitud;

    //Declaración de constructor
    /** Constructor del método GeoPunto.
     * @param latitud Valor en double de la latitud de la coordenada
     * @param longitud Valor en double de la longitud de la coordenada
     */
    public GeoPunto (double latitud, double longitud) {
        this.latitud = (int) (latitud * 1E6);
        this.longitud = (int) (longitud * 1E6);
    }

    /** Constructor del método GeoPunto.
     * @param latitud Valor en int de la latitud de la coordenada
     * @param longitud Valor en int de la longitud de la coordenada
     */
    public GeoPunto (int latitud, int longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
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
     * @param longitud Valor de la latitud de la coordenada
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /** Establece el valor del atributo latitud
     * @param latitud Valor de la latitud de la coordenada
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    //Otros métodos
    /** Transcribe el Complejo a String.
     * @return string con la parte entera y la imaginaria
     */
    public String toString () {
        return latitud + "+" + longitud + "i";
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

    /** Aproxima la distancia en metros entre dos puntos
     * @return double c
     */
    public double Distancia (int latitud2, int longitud2) {
        final double RADIO_TIERRA = 6371000; // en metros
        double dLat = Math.toRadians(latitud - latitud2);
        double dLon = Math.toRadians(longitud - longitud2);
        double lat1 = Math.toRadians(latitud2);
        double lat2 = Math.toRadians(latitud);
        double a =    Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.sin(dLon/2) * Math.sin(dLon/2) *
                        Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c * RADIO_TIERRA;
    }
}