package br.com.motta.senacflix.Classes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class PodcastDAO {

    public static void cadastrar(Podcast p) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(p);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static List<Podcast> buscar(String filtro) {
        List<Podcast> lista = new ArrayList<Podcast>();

        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("SELECT p FROM Podcast p WHERE (:produtor is null OR p.produtor LIKE :produtor)");
            consulta.setParameter("produtor", filtro.isEmpty() ? null : "%" + filtro + "%");
            lista = consulta.getResultList();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao listar os dados");
            System.out.println(e);
        } finally {
            JPAUtil.desconectar();
        }
        return lista;
    }

    public static List<Podcast> listar() {
        List<Podcast> lista = new ArrayList<Podcast>();

        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("FROM Podcast");
            lista = consulta.getResultList();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao listar os dados");
            System.out.println(e);
        } finally {
            JPAUtil.desconectar();
        }
        return lista;
    }

    public static void excluir(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            Podcast p = manager.find(Podcast.class, id);
            if (p != null) {
                manager.remove(p); //DELETE do SQL
            }
            manager.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao remover o rgistro.");
            System.out.println(e);
        } finally {
            JPAUtil.desconectar();
        }
    }
}
