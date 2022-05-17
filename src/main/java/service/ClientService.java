package service;

import lombok.RequiredArgsConstructor;
import model.Client;
import org.springframework.stereotype.Service;
import repository.ClientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository CLIENT_REPOSITORY;

    public Client findById(Long id) {
        return CLIENT_REPOSITORY.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Client> findAll() {
        return CLIENT_REPOSITORY.findAll();
    }

    public boolean deleteById(Long id) {
        CLIENT_REPOSITORY.deleteById(id);
        return true;
    }

    public Client save(Client client) {
        return CLIENT_REPOSITORY.save(client);
    }



}
