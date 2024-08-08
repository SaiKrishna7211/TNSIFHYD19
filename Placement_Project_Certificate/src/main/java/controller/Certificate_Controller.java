package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import entity.Certificate_Entity;
import service.Certificate_Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class Certificate_Controller {
	@Autowired
	private Certificate_Service cs;
	@PostMapping("/certificates")
	public Certificate_Entity saveCertificate(@RequestBody Certificate_Entity certificate_entity) {
		//TODO: process POST request
		
		return cs.saveCertificate(certificate_entity);
	}
	@GetMapping("/certificates")
	public List<Certificate_Entity> fetchCertificatesList(){
		return cs.fetchCertificatesList();
	}
	@GetMapping("/certificates/{id}")
	public Certificate_Entity fetchCertificateById(@PathVariable("id") Long id) {
		return cs.fetchCertificateById(id);
	}
	@DeleteMapping
	public String deleteCertificateById(@PathVariable("id") Long id) {
		cs.deleteCertificateById(id);
		return "Deleted Certificate...!";
	}
	@PutMapping("path/{id}")
	public Certificate_Entity updateCertificateById(@PathVariable("id") Long id, @RequestBody Certificate_Entity certificate_entity) {
		//TODO: process PUT request
		
		return cs.updateCertificateById(id,certificate_entity);
	}
}
