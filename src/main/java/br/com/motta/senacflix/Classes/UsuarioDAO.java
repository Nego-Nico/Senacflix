package br.com.motta.senacflix.Classes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class UsuarioDAO {

    public static Usuario validarUsuario(Usuario user) {
        EntityManager manager = JPAUtil.conectar();
        try {
            List<Usuario> usuarioEncontrados = (List<Usuario>) manager
                    .createQuery("SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha", Usuario.class)
                    .setParameter("login", user.getLogin())
                    .setParameter("senha", user.getSenha())
                    .getResultList();

            if (!usuarioEncontrados.isEmpty()) {
                System.out.println("Usuário encontrado");
                return usuarioEncontrados.get(0);
            } else {
                System.out.println("Nenhum usuário encontrado");
            }

        } catch (Exception e) {

        } finally {
            JPAUtil.desconectar();
        }
        return null;
    }
}
