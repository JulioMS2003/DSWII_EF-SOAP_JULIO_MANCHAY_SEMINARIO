package cibertec.edu.pe.edu.cibertec.DSWII_EF_SOAP_JULIO_MANCHAY_SEMINARIO.service;

import pe.edu.cibertec.ws.object.*;

public interface ILibroService {
    PostLibroResponse registrarLibro(PostLibroRequest request);
    PutLibroResponse actualizarLibro(PutLibroRequest request);
    GetLibrosResponse buscarLibros();
    GetLibroResponse buscarLibroXId(Integer id);
}
