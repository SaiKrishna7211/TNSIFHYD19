package service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.Certificate_Entity;
import repository.Certificate_Repository;

@Service
public class Certificate_Service_Impl implements Certificate_Service{
	@Autowired
	private Certificate_Repository cr;
	@Override
	public Certificate_Entity saveCertificate(Certificate_Entity certificate_entity) {
		// TODO Auto-generated method stub
		return cr.save(certificate_entity);
	}

	@Override
	public List<Certificate_Entity> fetchCertificatesList() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Certificate_Entity fetchCertificateById(Long id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	@Override
	public void deleteCertificateById(Long id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

	@Override
	public Certificate_Entity updateCertificateById(Long id, Certificate_Entity certificate_entity) {
		// TODO Auto-generated method stub
		Certificate_Entity ce=cr.findById(id).get();
		if(Objects.nonNull(certificate_entity.getYear())&&certificate_entity.getYear()!=0) {
			ce.setYear(certificate_entity.getYear());
		}
		if(Objects.nonNull(certificate_entity.getCollege())&&!"".equalsIgnoreCase(certificate_entity.getCollege())) {
			ce.setCollege(certificate_entity.getCollege());
		}
		return cr.save(ce);
	}

}
