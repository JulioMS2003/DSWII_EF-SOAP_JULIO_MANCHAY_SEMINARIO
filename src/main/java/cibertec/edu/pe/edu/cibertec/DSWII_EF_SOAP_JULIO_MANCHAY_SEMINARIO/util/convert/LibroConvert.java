package cibertec.edu.pe.edu.cibertec.DSWII_EF_SOAP_JULIO_MANCHAY_SEMINARIO.util.convert;

import cibertec.edu.pe.edu.cibertec.DSWII_EF_SOAP_JULIO_MANCHAY_SEMINARIO.model.Libro;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws.object.Librows;


import java.util.ArrayList;
import java.util.List;

@Component
public class LibroConvert {

    public Libro mapearALibros(Librows librows) {
        Libro libro = new Libro();
        libro.setId(librows.getId());
        libro.setTitulo(librows.getNombre());
        libro.setAutor(librows.getDescripcion());
        libro.setPrecio(librows.getPrecio());
        return libro;
    }
    public Librows mapearALibrosws(Libro libro) {
        Librows librows = new Librows();
        librows.setId(libro.getId());
        librows.setNombre(libro.getTitulo());
        librows.setDescripcion(libro.getAutor());
        librows.setPrecio(libro.getPrecio());
        return librows;
    }
    public List<Libro> mapearALibroList(List<Librows> librowsList) {
        List<Libro> libroList = new ArrayList<>();
        for (Librows librows : librowsList) {
            libroList.add(mapearALibros(librows));
        }
        return libroList;
    }
    public List<Librows> mapearALibrowsList(List<Libro> libroList) {
        List<Librows> librowsList = new ArrayList<>();
        for (Libro libro : libroList) {
            librowsList.add(mapearALibrosws(libro));
        }
        return librowsList;
    }

}
