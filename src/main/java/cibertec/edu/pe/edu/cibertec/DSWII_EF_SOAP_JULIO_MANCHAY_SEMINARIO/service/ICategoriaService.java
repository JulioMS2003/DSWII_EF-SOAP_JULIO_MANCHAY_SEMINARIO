package cibertec.edu.pe.edu.cibertec.DSWII_EF_SOAP_JULIO_MANCHAY_SEMINARIO.service;

import pe.edu.cibertec.ws.object.*;

public interface ICategoriaService {
    PostCategoriaResponse registrarCategoria(PostCategoriaRequest request);
    PutCategoriaResponse actualizarCategoria(PutCategoriaRequest request);
    GetCategoriasResponse buscarCategorias();
    GetCategoriaResponse buscarCategoriaXId(Integer id);
}
