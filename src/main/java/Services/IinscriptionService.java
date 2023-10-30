package Services;

import Entities.Inscription;

import java.util.List;

public interface IinscriptionService {

    List<Inscription> retrieveAllInscriptions();

    Inscription addInscription(Inscription i);

    Inscription updateInscription(Inscription i);

    Inscription retrieveInscription(Long numinscription);

    void removeInscription(Long numinscription);
}
