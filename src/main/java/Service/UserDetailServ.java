///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Service;
//
//import DAraizaPruebaTecnicaSortedFilter.demo.DAO.UsuarioNoDAOImplementation;
//import DAraizaPruebaTecnicaSortedFilter.demo.ML.Result;
//import DAraizaPruebaTecnicaSortedFilter.demo.ML.Usuario;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
///**
// *
// * @author digis
// */
//public class UserDetailServ implements UserDetailsService {
//
//    @Autowired
//    private UsuarioNoDAOImplementation usuarioNoDAOImplementation;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Result result = (Result) usuarioNoDAOImplementation.GetByUsername(username);
//        
//        Usuario usuario = (Usuario) result.object;
//        
//        return new CustomUserDetailsService(
//                usuario.getEmail(),
//                usuario.getPassword()
//                );
//    }
//
//}
