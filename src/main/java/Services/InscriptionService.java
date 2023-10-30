package Services;

import Entities.Inscription;
import Repositories.InscriptionRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
@AllArgsConstructor
public class InscriptionService implements IinscriptionService {

    InscriptionRepository inscriptionRepository;
    @Override
    public List<Inscription> retrieveAllInscriptions() {
       return inscriptionRepository.findAll();
    }

    @Override
    public Inscription addInscription(Inscription i) {
        return inscriptionRepository.save(i);
    }

    @Override
    public Inscription updateInscription(Inscription i) {
        return inscriptionRepository.save(i);
    }

    @Override
    public Inscription retrieveInscription(Long numinscription) {
        return inscriptionRepository.findById(numinscription).get();
    }

    @Override
    public void removeInscription(Long numinscription) {
        inscriptionRepository.deleteById(numinscription);

    }
}
