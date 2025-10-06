package br.com.motoapp.repository;

import br.com.motoapp.model.Moto;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MotoRepository {

    private List<Moto> motos = new ArrayList<>();

    // Salvar moto
    public void save(Moto moto) {
        motos.add(moto);
    }

    // Listar todas motos
    public List<Moto> findAll() {
        return new ArrayList<>(motos);
    }

    // Buscar moto por nome
    public Optional<Moto> findByName(String name) {
        return motos.stream().filter(m -> m.getName().equalsIgnoreCase(name)).findFirst();
    }

    // Remover moto
    public void delete(Moto moto) {
        motos.remove(moto);
    }
}
