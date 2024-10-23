package cibertec.edu.pe.edu.cibertec.DSWII_EF_SOAP_JULIO_MANCHAY_SEMINARIO.service;

import pe.edu.cibertec.ws.object.*;

public interface IMiembroService {
    PostMiembroResponse registrarMiembro(PostMiembroRequest request);
    PutMiembroResponse actualizarMiembro(PutMiembroRequest request);
    GetMiembrosResponse buscarMiembros();
    GetMiembroResponse buscarMiembroXId(Integer id);
}
