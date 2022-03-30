package in.prabodh.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.prabodh.entity.NbfcMaster;
import in.prabodh.repo.NbfcRepository;

@Service
public class MasterNbfcService {
	@Autowired
	NbfcRepository nbfcRepo;

	public List<NbfcMaster> getAllMaster() {
		List<NbfcMaster> nbfcs = new ArrayList<NbfcMaster>();
		nbfcRepo.findAll().forEach(nbfc -> nbfcs.add(nbfc));
		return nbfcs;
	}

	public NbfcMaster getNbfcById(int id) {

		return nbfcRepo.findById(id).get();
	}

	public void saveOrUpdate(NbfcMaster master) {
		nbfcRepo.save(master);
	}

	public void delete(int id) {
		nbfcRepo.deleteById(id);
	}

	public void update(NbfcMaster master, int id) {
		nbfcRepo.save(master);
	}
	public NbfcMaster getNbfcByNbfc_name(String name) {

		return nbfcRepo.findByNbfc_name(name).get();
	}

}
