/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAraizaPruebaTecnicaSortedFilter.demo.DAO;

import DAraizaPruebaTecnicaSortedFilter.demo.ML.Direccion;
import DAraizaPruebaTecnicaSortedFilter.demo.ML.Result;
import DAraizaPruebaTecnicaSortedFilter.demo.ML.Usuario;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author digis
 */
public class UsuarioNoDAOImplementation implements IUsuario {

    @Override
    public Result GetALL() {
        Result result = new Result();
        try{
        ArrayList<Usuario> usuarios = new ArrayList<>();

        Direccion direccion1 = new Direccion(1, "DireccionCasa", "Reforma", "MX");
        Direccion direccion2 = new Direccion(2, "DireccionTrabajo", "Chabacano", "MX");
        Direccion direccion3 = new Direccion(3, "DireccionCasa", "Gustavo A. Madero", "MX");
        Direccion direccion4 = new Direccion(3, "DireccionCasa", "Polanco", "MX");

        Usuario usuario1 = new Usuario();
        usuario1.setEmail("usuario@email.com");
        usuario1.setFecha(LocalDate.of(2000, Month.MARCH, 19));
        usuario1.setTaxId("FFAFAFLLFM4OO444");
        usuario1.setTelefono("7444494504");
        usuario1.setUsername("Usuario1");
        usuario1.setPassword("Welcome01");
        usuario1.setDirecciones(direccion1);

        Usuario usuario2 = new Usuario();
        usuario1.setEmail("usuario2@email.com");
        usuario1.setFecha(LocalDate.of(1990, Month.AUGUST, 2));
        usuario1.setTaxId("sSDADAFA4433");
        usuario1.setTelefono("7444494504");
        usuario1.setUsername("Usuario2");
        usuario1.setPassword("Welcome01");
        usuario1.setDirecciones(direccion3);

        Usuario usuario3 = new Usuario();
        usuario1.setEmail("usuario@email.com");
        usuario1.setFecha(LocalDate.of(2003, Month.MARCH, 29));
        usuario1.setTaxId("FFAFAFLLFM4OO444");
        usuario1.setTelefono("7444494504");
        usuario1.setUsername("Usuario1");
        usuario1.setPassword("Welcome01");
        usuario1.setDirecciones(direccion4);

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        result.objects = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            result.objects.add(usuario);

        }
        result.correct = true;
        }
        catch(Exception ex){
            result.correct = false;
            result.errorMessage = ex.getLocalizedMessage();
            result.ex = ex;
        }

        return result;
    }

}
