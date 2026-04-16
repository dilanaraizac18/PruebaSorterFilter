/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component;

import DAraizaPruebaTecnicaSortedFilter.demo.DAO.UsuarioNoDAOImplementation;
import DAraizaPruebaTecnicaSortedFilter.demo.ML.Direccion;
import DAraizaPruebaTecnicaSortedFilter.demo.ML.Result;
import DAraizaPruebaTecnicaSortedFilter.demo.ML.Usuario;
import jakarta.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author digis
 */
@Component
public class UsuarioComponent {
    
    
    @PostConstruct
    public ArrayList<Usuario> PostContructUsuario(){
                ArrayList<Usuario> usuarios = new ArrayList<>();

          UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();
        Result result = new Result();
//        try{
        ArrayList<Direccion> direcciones = new ArrayList<>();
        Usuario usuario1 = new Usuario();
        
        usuario1.setIdUsuario(uuidString);
        usuario1.setEmail("usuario@email.com");
        usuario1.setFecha(LocalDate.of(2000, Month.MARCH, 19));
        usuario1.setTaxId("FFAFAFLLFM4OO444");
        usuario1.setTelefono("7444494504");
        usuario1.setUsername("Usuario1");
        usuario1.setPassword("Welcome01");

        usuario1.Direcciones = new ArrayList<>();
        Direccion direccion1 = new Direccion();
        direccion1.setIdDireccion(1);
        direccion1.setCalle("Revolucion");
        direccion1.setNombre("Direccion casa");
        direccion1.setPais("MX");
        
        usuario1.Direcciones.add(direccion1);
        
        Direccion direccion2 = new Direccion();
        direccion2.setIdDireccion(2);
        direccion2.setCalle("Reforma");
        direccion2.setNombre("Direccion Trabajo");
        direccion2.setPais("MX");
        
        usuario1.Direcciones.add(direccion2);
        
        Usuario usuario2 = new Usuario();
        usuario2.setIdUsuario(uuidString);
        usuario2.setEmail("usuario2@email.com");
        usuario2.setFecha(LocalDate.of(1990, Month.AUGUST, 2));
        usuario2.setTaxId("sSDADAFA4433");
        usuario2.setTelefono("6444494504");
        usuario2.setUsername("Usuario2");
        usuario2.setPassword("Welcome01");

        usuario2.Direcciones = new ArrayList<>();
        Direccion direccion3 = new Direccion();
        direccion3.setIdDireccion(3);
        direccion3.setCalle("Cuzco");
        direccion3.setNombre("Direccion casa");
        direccion3.setPais("MX");
        
        usuario2.Direcciones.add(direccion3);
        
        Usuario usuario3 = new Usuario();
        usuario3.setIdUsuario(uuidString);
        usuario3.setEmail("usuario@email.com");
        usuario3.setFecha(LocalDate.of(2003, Month.MARCH, 29));
        usuario3.setTaxId("FFAFAFLLFM4OO444");
        usuario3.setTelefono("5444494504");
        usuario3.setUsername("Usuario1");
        usuario3.setPassword("Welcome01");

        usuario3.Direcciones = new ArrayList<>();
        Direccion direccion4 = new Direccion();
        direccion4.setIdDireccion(4);
        direccion4.setCalle("Matanza");
        direccion4.setNombre("Direccion casa");
        direccion4.setPais("MX");
        
        usuario3.Direcciones.add(direccion4);
        
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        
        
        return usuarios;
    }
    
    
}
