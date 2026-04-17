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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity ObtenerDatos() {
        List<Usuario> usuario = new ArrayList<>();
        try {
            usuario = usuarioNoDAOImplementation.GetALL();

            return ResponseEntity.ok(usuario);

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(ex);
        }
    }

    @GetMapping("/users/sorter")
    public ResponseEntity SortedBy(@RequestParam("sortedBy") String sortedBy) {
        List<Usuario> usuario = new ArrayList<>();

        try {
            usuario = usuarioNoDAOImplementation.Sorted(sortedBy);

            return ResponseEntity.ok(usuario);

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(ex);

        }
    }

    @GetMapping("/users/filter")
    public ResponseEntity FilterBy(@RequestParam("filterBy") String filterBy) {
        List<Usuario> usuario = new ArrayList<>();

        try {
            usuario = usuarioNoDAOImplementation.Filter(filterBy);

            return ResponseEntity.ok(usuario);

        } catch (Exception ex) {
            return ResponseEntity.status(500).body(ex);

        }
    }

    @PostMapping("Post/users")
    public ResponseEntity Add(@RequestBody Usuario usuario) {
        Result result = new Result();
        try {
            result = usuarioNoDAOImplementation.Post(usuario);

            if (result.correct) {
                return ResponseEntity.ok(result);
            } else {
                return ResponseEntity.status(400).body(result);
            }
        } catch (Exception ex) {
            result.correct = false;
            result.errorMessage = ex.getLocalizedMessage();
            result.ex = ex;
        }
        return ResponseEntity.status(500).body("No se pudo ejecutar la accion");
    }

    @DeleteMapping("Delete/user")
    public ResponseEntity Delete(@RequestParam("email") String email) {
        Result result = new Result();

        try {
            result = usuarioNoDAOImplementation.Delete(email);

            if (result.correct) {
                return ResponseEntity.ok(result);
            } else {
                return ResponseEntity.status(400).body(result);
            }

        } catch (Exception ex) {
            result.correct = false;
            result.errorMessage = ex.getLocalizedMessage();
            result.ex = ex;
        }
        return ResponseEntity.status(500).body("Se ha producido un error");
    }

    @PatchMapping("Patch/user")
    public ResponseEntity Patch(@RequestParam("email") String email, @RequestBody Usuario usuario) {
        Result result = new Result();

        try {
            result = usuarioNoDAOImplementation.Patch(email, usuario);

            if (result.correct) {
                return ResponseEntity.ok(result);
            } else {
                return ResponseEntity.status(400).body(result);
            }

        } catch (Exception ex) {
            result.correct = false;
            result.errorMessage = ex.getLocalizedMessage();
            result.ex = ex;
        }
        return ResponseEntity.status(500).body("No se ha podido realizar la acción");
    }

}
