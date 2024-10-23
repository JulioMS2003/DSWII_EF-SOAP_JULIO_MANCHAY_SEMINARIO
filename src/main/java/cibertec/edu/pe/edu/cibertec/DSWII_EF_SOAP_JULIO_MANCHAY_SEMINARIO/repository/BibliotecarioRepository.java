package cibertec.edu.pe.edu.cibertec.DSWII_EF_SOAP_JULIO_MANCHAY_SEMINARIO.repository;

import cibertec.edu.pe.edu.cibertec.DSWII_EF_SOAP_JULIO_MANCHAY_SEMINARIO.model.Bibliotecario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<Bibliotecario,Integer> {
}
