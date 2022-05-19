package controller;

import lombok.RequiredArgsConstructor;
import model.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ClientService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private final ClientService CLIENT_SERVICE;

    @GetMapping
    public ResponseEntity<List<Client>> getAll() {
        return ResponseEntity.ok(CLIENT_SERVICE.findAll());
    }

    @GetMapping("client/{id}")
    public ResponseEntity<Client> getById(@PathVariable Long id) {
        return ResponseEntity.ok(CLIENT_SERVICE.findById(id));
    }

    @PostMapping
    public ResponseEntity<Client> save(@RequestBody Client client) {
        return ResponseEntity.ok(CLIENT_SERVICE.save(client));
    }

    @DeleteMapping("client/{id}")
    public boolean deleteById(@PathVariable long id) {
        return CLIENT_SERVICE.deleteById(id);
    }


}
