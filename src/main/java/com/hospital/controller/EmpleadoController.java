package com.hospital.controller;

import com.hospital.model.Empleado;
import com.hospital.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleado> getAllEmployees() {
        return empleadoService.getAllEmpleados();
    }

    // Implementa más endpoints según sea necesario
}
