/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAraizaPruebaTecnicaSortedFilter.demo.DAO;

import Component.UsuarioComponent;
import DAraizaPruebaTecnicaSortedFilter.demo.ML.Direccion;
import DAraizaPruebaTecnicaSortedFilter.demo.ML.Result;
import DAraizaPruebaTecnicaSortedFilter.demo.ML.Usuario;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collector;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author digis
 */
@Service
public class UsuarioNoDAOImplementation implements IUsuario {


    @Autowired
    private UsuarioComponent usuarioComponent;
    
    
    @Override
    public ArrayList<Usuario> GetALL() {
        
      

        return new ArrayList<>(usuarioComponent.PostContructUsuario());

        
        
        
        
    }
    
    public List<Usuario> Sorted(String sortedBy){
        
        Result result = new Result();
        
        List<Usuario> lista = GetALL();
        
        if(sortedBy == null || sortedBy.isEmpty()){
            return lista;
        }
        
        return lista.stream().sorted((p1, p2)->{
            switch (sortedBy.toLowerCase()) {
                case "email":
                    return p1.getEmail().compareTo(p2.getEmail());
                case "id":
                    return p1.getIdUsuario().compareTo(p2.getIdUsuario());
                case "name":
                    return p1.getUsername().compareTo(p2.getUsername());
                case "phone":
                    return p1.getTelefono().compareTo(p2.getTelefono());
                case "tax_id":
                    return p1.getTaxId().compareTo(p2.getTaxId());
                case "created_at":
                    return p1.getFecha().compareTo(p2.getFecha());
                
                default:
            
            
            return 0;
            
        }
        }
        ).collect(toList());
        
    
        
        
        
    
    }

    
 @Override
public List<Usuario> Filter(String filterBy) {

    String filterValido = filterBy.replace(" ", "+");
    List<Usuario> lista = GetALL();

    if (filterBy == null || filterBy.isEmpty()) {
        throw new RuntimeException("El filtro no puede ser vacío");
    }

    String[] partes = filterValido.split("\\+");

    if (partes.length != 3) {
        throw new RuntimeException("Formato inválido. Usa: campo+operador+valor");
    }

    String campo = partes[0].toLowerCase();
    String operador = partes[1].toLowerCase();
    String valor = partes[2].toLowerCase();

    return lista.stream().filter(u -> {

        String campoValor = "";

        switch (campo) {
            case "email":
                campoValor = u.getEmail();
                break;
            case "id":
                campoValor = u.getIdUsuario();
                break;
            case "name":
                campoValor = u.getUsername();
                break;
            case "phone":
                campoValor = u.getTelefono();
                break;
            case "tax_id":
                campoValor = u.getTaxId();
                break;
            case "created_at":
                campoValor = u.getFecha().toString();
                break;
            default:
                return false;
        }

        if (campoValor == null) return false;

        campoValor = campoValor.toLowerCase();

        switch (operador) {
            case "co": // contains
                return campoValor.contains(valor);

            case "sw": // starts with
                return campoValor.startsWith(valor);

            case "ew": // ends with
                return campoValor.endsWith(valor);

            case "eq": // equals
                return campoValor.equals(valor);

            default:
                throw new RuntimeException("Operador no válido");
        }

    }).collect(toList());
}

    @Override
    public Usuario Post( Usuario usuario) {
        
        Result result = new Result();
        
        usuario.setUsername(usuario.getUsername());
        usuario.setEmail(usuario.getEmail());
        usuario.setPassword(usuario.getPassword());
        usuario.setTaxId(usuario.getTaxId());
        
        List<Usuario> lista = usuarioComponent.PostContructUsuario();
        
        lista.add(usuario);
        return usuario;
    }


}
                
        
    


