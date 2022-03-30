package in.prabodh.repo;





import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import in.prabodh.entity.NbfcMaster;

public interface NbfcRepository extends CrudRepository<NbfcMaster, Integer> {

    

     Optional <NbfcMaster> findByNbfc_name(String nbfc_name);



    



}
