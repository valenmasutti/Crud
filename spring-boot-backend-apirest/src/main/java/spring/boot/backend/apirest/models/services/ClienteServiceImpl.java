package spring.boot.backend.apirest.models.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.boot.backend.apirest.models.dao.IClienteDao;
import spring.boot.backend.apirest.models.entity.Cliente;

import java.util.List;
@Service
public class ClienteServiceImpl implements IClienteService{
    @Autowired
    private IClienteDao clienteDao;
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {

        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Cliente> findAll(Pageable pegeable) {
        return clienteDao.findAll(pegeable);
    }

    @Override
    public Cliente findById(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    public void delete(Long id) {
    clienteDao.deleteById(id);
    }


}
