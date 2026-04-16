/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAraizaPruebaTecnicaSortedFilter.demo.DAO;

import DAraizaPruebaTecnicaSortedFilter.demo.ML.Result;
import DAraizaPruebaTecnicaSortedFilter.demo.ML.Usuario;
import java.util.List;

/**
 *
 * @author digis
 */
public interface IUsuario {
    List<Usuario> GetALL(); 
    List<Usuario> Sorted(String sortedBy);
    List<Usuario> Filter(String filterBy);
    Usuario Post(Usuario usuario);
}
