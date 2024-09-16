package com.hospital.service;

import com.hospital.model.Empleado;
import com.hospital.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    // Implementa métodos para todas las operaciones requeridas
    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    // Añade más métodos según sea necesario
}
