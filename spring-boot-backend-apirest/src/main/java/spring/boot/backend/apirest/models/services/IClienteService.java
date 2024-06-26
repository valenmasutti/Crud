package spring.boot.backend.apirest.models.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import spring.boot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pegeable);

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);
}
