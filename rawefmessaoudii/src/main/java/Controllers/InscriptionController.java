package Controllers;

import Entities.Inscription;
import Services.IinscriptionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/Inscription")
public class InscriptionController {
    IinscriptionService iinscriptionServicen;

    @GetMapping("/allInscription")
    public List<Inscription> getInscription() {
        List<Inscription> listInscription = iinscriptionServicen.retrieveAllInscriptions();
        return listInscription;
    }

    @GetMapping("/Inscription/{numinscription}")
    public Inscription retrieveInscription(@PathVariable("numinscription") Long numinscription) {
        return iinscriptionServicen.retrieveInscription(numinscription);
    }

    @PostMapping("/addInscription")
    public Inscription addEtudiant(@RequestBody Inscription b) {
        Inscription inscription = iinscriptionServicen.addInscription(b);
        return inscription;
    }

    @DeleteMapping("/RemoveInscription/{numinscription}")
    public void removeInscription(@PathVariable("numinscription") Long numinscription) {
        iinscriptionServicen.removeInscription(numinscription);
    }

    @PutMapping("/UpdateInscription")
    public Inscription updateInscription(@RequestBody Inscription e) {
        Inscription inscription= iinscriptionServicen.updateInscription(e);
        return inscription;
    }

}
