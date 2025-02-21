package br.com.motta.senacflix.Classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Podcast")
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String produtor;
    private String nome_do_episodio;
    private int nEpisodio;
    private String duracao;
    @Column(name = "URL_Repositorio")
    private String url_do_repositorio;

    public Podcast() {

    }

    public Podcast(int id, String produtor, String nome_do_episodio, int nEpisodio, String duracao, String url_do_repositorio) {
        this.id = id;
        this.produtor = produtor;
        this.nome_do_episodio = nome_do_episodio;
        this.nEpisodio = nEpisodio;
        this.duracao = duracao;
        this.url_do_repositorio = url_do_repositorio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNome_do_episodio() {
        return nome_do_episodio;
    }

    public void setNome_do_episodio(String nome_do_episodio) {
        this.nome_do_episodio = nome_do_episodio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getUrl_do_repositorio() {
        return url_do_repositorio;
    }

    public void setUrl_do_repositorio(String url_do_repositorio) {
        this.url_do_repositorio = url_do_repositorio;
    }

    public int getnEpisodio() {
        return nEpisodio;
    }

    public void setnEpisodio(int nEpisodio) {
        this.nEpisodio = nEpisodio;
    }

}
