package com.miempresa.servicio;

import com.miempresa.interfaceServicio.IEmpleadoServicio;
import com.miempresa.interfaces.IEmpleado;
import com.miempresa.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServicio implements IEmpleadoServicio {

    @Autowired
    private IEmpleado repo;

    @Override
    public List<Empleado> listar() {
        return (List<Empleado>)repo.findAll() ;
    }

    @Override
    public Optional<Empleado> listarId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int guardar(Empleado p) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void borrar(int id) {
        // TODO Auto-generated method stub

    }
}
