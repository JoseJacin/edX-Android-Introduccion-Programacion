package org.example.mislugares;

public class Lugar {
    //Declaración de atributos
    private String nombre;
    private String direccion;
    private GeoPunto posicion;
    private String foto;
    private int telefono;
    private String url;
    private String comentario;
    private long fecha;
    private float valoracion;
    private TipoLugar tipo;

    //Declaración de constructor
    /** Constructor de la clase  Lugar
     * @param nombre Nombre de la localización
     * @param direccion Dirección de la localización
     * @param longitud Coordenada longitud de la localización
     * @param latitud Coordenada latitud de la localización
     * @param tipo Tipo de Lugar
     * @param telefono Teléfono de la localización
     * @param url URL de la localización
     * @param comentario Comentario de la localización
     * @param valoracion Valoración de la localización
     */
    public Lugar(String nombre, String direccion, double longitud,
                 double latitud, TipoLugar tipo, int telefono,
                 String url, String comentario, int valoracion) {
        fecha = System.currentTimeMillis();
        posicion = new GeoPunto(longitud, latitud);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.url = url;
        this.comentario = comentario;
        this.valoracion = valoracion;
        this.tipo = tipo;
    }

    /** Sobrecarga del Contructor de la clase Lugar
     *
     */
    public Lugar() {
        fecha = System.currentTimeMillis();
        posicion = new GeoPunto(0,0);
        tipo = TipoLugar.OTROS;
    }

    //Declaración de los métodos GET
    /** Obtiene el valor del atributo Nombre.
     * @return String Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /** Obtiene el valor del atributo Direccion.
     * @return String Direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /** Obtiene el valor del atributo Posicion.
     * @return GeoPunto Posicion
     */
    public GeoPunto getPosicion() {
        return posicion;
    }

    /** Obtiene el valor del atributo Foto.
     * @return String Foto
     */
    public String getFoto() {
        return foto;
    }

    /** Obtiene el valor del atributo Telefono.
     * @return int Telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /** Obtiene el valor del atributo Url.
     * @return String Url
     */
    public String getUrl() {
        return url;
    }

    /** Obtiene el valor del atributo Comentario.
     * @return String Comentario
     */
    public String getComentario() {
        return comentario;
    }

    /** Obtiene el valor del atributo Fecha.
     * @return long Fecha
     */
    public long getFecha() {
        return fecha;
    }

    /** Obtiene el valor del atributo Valoracion.
     * @return float Valoracion
     */
    public float getValoracion() {
        return valoracion;
    }

    /** Obtiene el valor del atributo Tipo.
     * @return TipoLugar Tipo
     */
    public TipoLugar getTipo() {
        return tipo;
    }

    //Declaración de los métodos SET
    /** Establece el valor del atributo Nombre.
     * @param nombre Nombre del lugar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Establece el valor del atributo Direccion.
     * @param direccion Dirección del lugar
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /** Establece el valor del atributo Posicion.
     * @param posicion Coordenadas del lugar
     */
    public void setPosicion(GeoPunto posicion) {
        this.posicion = posicion;
    }

    /** Establece el valor del atributo Foto.
     * @param foto Foto del lugar
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /** Establece el valor del atributo Telefono.
     * @param telefono Teléfono del lugar
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /** Establece el valor del atributo Url.
     * @param url URL del lugar
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /** Establece el valor del atributo Comentario.
     * @param comentario Comentario del lugar
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /** Establece el valor del atributo Fecha.
     * @param fecha Fecha en la que se añade el lugar
     */
    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    /** Establece el valor del atributo Valoracion.
     * @param valoracion Valoración del lugar
     */
    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    /** Establece el valor del atributo Lugar.
     * @param tipo Tipo del lugar
     */
    public void setTipo(TipoLugar tipo) {
        this.tipo = tipo;
    }

    //Declaración del método toString
    /** Transforma a String el atributo indicado.
     * @return String atributo
     */
    @Override
    public String toString() {
        return "Lugar{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", posicion=" + posicion +
                ", foto='" + foto + '\'' +
                ", telefono=" + telefono +
                ", url='" + url + '\'' +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + fecha +
                ", valoracion=" + valoracion +
                ", tipo=" + tipo +
                '}';
    }
}