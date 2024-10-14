package com.example.invex.services;

import org.springframework.stereotype.Service;

import com.example.invex.models.EmpleadosModel;
import com.example.invex.repositories.EmpleadosRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

@Service

public class EmpleadoService {
    //el siguiente tag nos permite no instanciar
    @Autowired
    EmpleadosRepository empleadosRepository;
    //el siguiente metodo nos ayuda a listar todos los empeados registrados en la tabla de empleados
    public ArrayList<EmpleadosModel> listAllEmpleados (){
        //se castea un arreglo de tipo EmpleadosModel para poder retornarlo en un json
        return (ArrayList<EmpleadosModel>) empleadosRepository.findAll();
    }

    

    //actualice cualquier dato del empleado
    //inserte uno o varios empleados en una sola petción
    //el siguiente metodo recibe en los parametros los datos de un Empleado y le asigna un ID
    public ArrayList<EmpleadosModel>  saveEmpleado(ArrayList<EmpleadosModel>  empleado){
        return (ArrayList<EmpleadosModel>) empleadosRepository.saveAll(empleado);
    }

    //borra un empleado, requiriendo como parámetro el id de registro.
    public boolean deleteByID(Long id){
        try{
        empleadosRepository.deleteById(id);
        return true;
        }
        catch(Exception err){
            return false;
        }
    }

}
