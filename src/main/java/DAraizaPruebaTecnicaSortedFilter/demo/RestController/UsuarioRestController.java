/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAraizaPruebaTecnicaSortedFilter.demo.RestController;

import DAraizaPruebaTecnicaSortedFilter.demo.DAO.UsuarioNoDAOImplementation;
import DAraizaPruebaTecnicaSortedFilter.demo.ML.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digis
 */
@RestController
@RequestMapping("nuevo")
public class UsuarioRestController {
    
    @Autowired
    private UsuarioNoDAOImplementation usuarioNoDAOImplementation;
    
     @GetMapping
    public ResponseEntity ObtenerDatos(){
        Result result = new Result();
        try{
        result = usuarioNoDAOImplementation.GetALL();

        if(result.correct){
            if(result.objects != null || !result.objects.isEmpty()){
                return ResponseEntity.ok(result);
            } else{
               return ResponseEntity.noContent().build();
            }

        }else {
                return ResponseEntity.badRequest().body(result.errorMessage);
            }

        }catch(Exception ex){
            return ResponseEntity.status(500).body(ex);
        }
    }
}
