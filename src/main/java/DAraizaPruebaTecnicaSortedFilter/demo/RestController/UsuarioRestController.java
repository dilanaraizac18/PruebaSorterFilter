/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAraizaPruebaTecnicaSortedFilter.demo.RestController;

import DAraizaPruebaTecnicaSortedFilter.demo.DAO.UsuarioNoDAOImplementation;
import DAraizaPruebaTecnicaSortedFilter.demo.ML.Result;
import DAraizaPruebaTecnicaSortedFilter.demo.ML.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digis
 */
@RestController
@RequestMapping("api")
public class UsuarioRestController {
    
    @Autowired
    private UsuarioNoDAOImplementation usuarioNoDAOImplementation;
    
     @GetMapping
    public ResponseEntity ObtenerDatos(){
        List<Usuario> usuario = new ArrayList<>();
        try{
        usuario = usuarioNoDAOImplementation.GetALL();

        
                return ResponseEntity.ok(usuario);
            

        }catch(Exception ex){
            return ResponseEntity.status(500).body(ex);
        }
    }
    
    @GetMapping("/users/sorter")
    public ResponseEntity SortedBy(@RequestParam("sortedBy") String sortedBy){
        List<Usuario> usuario = new ArrayList<>();
        
        
        try{
             usuario =  usuarioNoDAOImplementation.Sorted(sortedBy);
            
            
                return ResponseEntity.ok(usuario);
          

        
        }catch(Exception ex){
         return ResponseEntity.status(500).body(ex);

        }
    }
    
    @GetMapping("/users/filter")
    public ResponseEntity FilterBy(@RequestParam("filterBy") String filterBy){
        List<Usuario> usuario = new ArrayList<>();
        
        
        try{
             usuario =  usuarioNoDAOImplementation.Filter(filterBy);
            
            
                return ResponseEntity.ok(usuario);
          

        
        }catch(Exception ex){
         return ResponseEntity.status(500).body(ex);

        }
    }
}
