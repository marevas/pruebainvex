
package com.example.invex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.invex.models.EmpleadosModel;

//nota que en los parametros recibe el nombre de la clase EmpleadosModel y Long porque es el tipo de identificador ID
 @Repository
 public interface EmpleadosRepository extends JpaRepository<EmpleadosModel, Long>{
}
