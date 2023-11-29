package com.miempresa.interfaces;

import com.miempresa.modelo.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleado extends CrudRepository<Empleado,Integer> {


}
