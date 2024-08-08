package service;

import java.util.List;

import entity.Certificate_Entity;

public interface Certificate_Service {

	Certificate_Entity saveCertificate(Certificate_Entity certificate_entity);

	List<Certificate_Entity> fetchCertificatesList();

	Certificate_Entity fetchCertificateById(Long id);

	void deleteCertificateById(Long id);

	Certificate_Entity updateCertificateById(Long id, Certificate_Entity certificate_entity);

}
