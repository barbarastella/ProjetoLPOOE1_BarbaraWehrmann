package br.edu.ifsul.cc.projetolpooe1_barbarawehrmann.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Table(name = "midias")
public class Midias implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "url")
    private String url;

    @ManyToMany(mappedBy = "midias")
    private List<Noticias> noticias;

    public Midias() {}

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrl() {
        return url;
    }

    public List<Noticias> getNoticias() {
        return noticias;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setNoticias(List<Noticias> noticias) {
        this.noticias = noticias;
    }
}
