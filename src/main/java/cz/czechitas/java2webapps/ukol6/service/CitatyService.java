package cz.czechitas.java2webapps.ukol6.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitatyService {
    private CitatyRepository repository;
    private NahodneCisloService nahodne;


    public String nahodnyCitat(){
        return repository.citat(nahodne.dejNahodneCislo(repository.pocet()));
    }

    @Autowired
    public CitatyService() {
        this.repository = new CitatyRepository();
        this.nahodne = new NahodneCisloService();
    }
}
