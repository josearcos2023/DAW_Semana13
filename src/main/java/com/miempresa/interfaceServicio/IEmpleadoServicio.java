package com.miempresa.interfaceServicio;

import com.miempresa.modelo.Empleado;
import lombok.Data;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface IEmpleadoServicio {

    public List<Empleado> listar();
    public Optional<Empleado> listarId(int id);
    public int guardar(Empleado p);
    public void borrar(int id);

}
