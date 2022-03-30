package in.prabodh.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.prabodh.entity.NbfcMaster;
import in.prabodh.service.MasterNbfcService;

@RestController
public class MasterRestcontroller {
	@Autowired
	MasterNbfcService nbfcService;

	@GetMapping("/nbfc")
	private List<NbfcMaster> getAllMaster() {
		return nbfcService.getAllMaster();
	}

	@GetMapping("/nbfc/{id}")
	private NbfcMaster getMaster(@PathVariable("id") int id) {
		return nbfcService.getNbfcById(id);
	}
	@GetMapping("/nbfc/{name}")
	public NbfcMaster getNbfcByNbfc_name(@PathVariable("name") String name) {
		return nbfcService.getNbfcByNbfc_name(name);
	}

	@DeleteMapping("/nbfc/{id}")
	private void deleteMaster(@PathVariable("id") int id) {
		nbfcService.delete(id);
	}

	@PostMapping("/nbfc")
	private int saveMaster(@RequestBody NbfcMaster nbfc) {
		nbfcService.saveOrUpdate(nbfc);
		return nbfc.getId();
	}

	@PutMapping("/nbfc")
	private NbfcMaster update(@RequestBody NbfcMaster nbfc) {
		nbfcService.saveOrUpdate(nbfc);
		return nbfc;
	}

}
