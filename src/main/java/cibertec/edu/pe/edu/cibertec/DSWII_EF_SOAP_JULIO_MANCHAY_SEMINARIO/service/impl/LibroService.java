package cibertec.edu.pe.edu.cibertec.DSWII_EF_SOAP_JULIO_MANCHAY_SEMINARIO.service.impl;

import cibertec.edu.pe.edu.cibertec.DSWII_EF_SOAP_JULIO_MANCHAY_SEMINARIO.exception.NotFoundException;
import cibertec.edu.pe.edu.cibertec.DSWII_EF_SOAP_JULIO_MANCHAY_SEMINARIO.model.Libro;
import cibertec.edu.pe.edu.cibertec.DSWII_EF_SOAP_JULIO_MANCHAY_SEMINARIO.repository.LibroRepository;
import cibertec.edu.pe.edu.cibertec.DSWII_EF_SOAP_JULIO_MANCHAY_SEMINARIO.service.ILibroService;
import cibertec.edu.pe.edu.cibertec.DSWII_EF_SOAP_JULIO_MANCHAY_SEMINARIO.util.convert.LibroConvert;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ws.object.*;

@RequiredArgsConstructor
@Service
public class LibroService implements ILibroService {
    private final LibroRepository libroRepository;
    private final LibroConvert libroConvert;

    @Override
    public PostLibroResponse registrarLibro(PostLibroRequest request) {
        PostLibroResponse postLibroResponse = new PostLibroResponse();
        Libro nuevoLibro = libroRepository.save(
                libroConvert.mapearALibros(request.getLibro())
        );
        postLibroResponse.setLibro(
                libroConvert.mapearALibrosws(nuevoLibro)
        );
        return postLibroResponse;    }

    @Override
    public PutLibroResponse actualizarLibro(PutLibroRequest request) {
        PutLibroResponse putLibroResponse = new PutLibroResponse();
        Libro libro = libroRepository.findById(request.getLibro().getId()).orElse(null);
        if(libro ==null) {
            throw new NotFoundException("Libro con el ID " + request.getLibro().getId() + " no encontrado");
        }else {
            putLibroResponse.setLibro(
                    libroConvert.mapearALibrosws(libroRepository.save(
                            libroConvert.mapearALibros(request.getLibro())
                    ))
            );
        }
        return putLibroResponse;    }

    @Override
    public GetLibrosResponse buscarLibros() {
        GetLibrosResponse getLibrosResponse = new GetLibrosResponse();
        getLibrosResponse.getLibros().addAll(
                libroConvert.mapearALibrowsList(libroRepository.findAll())
        );
        return getLibrosResponse;    }

    @Override
    public GetLibroResponse buscarLibroXId(Integer id) {
        GetLibroResponse getLibroResponse = new GetLibroResponse();
        Libro libro = libroRepository.findById(id).orElse(null);
        if(libro==null){
            throw new NotFoundException("Libro con el ID "+id+" no encontrado");
        }else{
            getLibroResponse.setLibro(
                    libroConvert.mapearALibrosws(libro)
            );
        }
        return getLibroResponse;    }
}
