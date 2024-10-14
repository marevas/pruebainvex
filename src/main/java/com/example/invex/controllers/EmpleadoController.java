package com.example.invex.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.invex.services.EmpleadoService;

import com.example.invex.models.EmpleadosModel;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping()
    //en esta peticion get se manda listar los empleados guardados en la tabla empleados
    public ArrayList<EmpleadosModel> listAllEmpleados() {
        return empleadoService.listAllEmpleados();
    }

    @PostMapping()
    //en esta peticion post guardan los empleados y se retorna el empleado nuevo con id o actualizado e caso de que no se mande el id
    //recibe infor dentro de la solicitud http
    public ArrayList<EmpleadosModel> saveEmpleado(@RequestBody ArrayList<EmpleadosModel> empleado){
        return this.empleadoService.saveEmpleado(empleado);
    }

    @DeleteMapping(path = "/{id}")
    //este metodo recide un id coomo parametro y borra un registro de empleados asociado al id
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean  ok = empleadoService.deleteByID(id);
        if (ok) {
            return("se elimino empleado por id" + id);
        }
        else {
            return("no se pudo eliminar empleado por id" + id);
        }       
    }
    }
    

