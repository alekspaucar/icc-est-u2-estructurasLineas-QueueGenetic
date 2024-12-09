package materia.models.models;

public class Pantalla {
private String nombre;
private String ruta;
private int id;
public Pantalla(int id,String nombre,String ruta){
this.id=id;
this.nombre=nombre;
this.ruta=ruta;

}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getRuta() {
    return ruta;
}
public void setRuta(String ruta) {
    this.ruta = ruta;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
@Override
public String toString(){}
}