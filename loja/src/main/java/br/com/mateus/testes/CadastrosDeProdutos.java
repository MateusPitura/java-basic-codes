package br.com.mateus.testes;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import br.com.mateus.util.JPAUtil;
import br.com.mateus.modelo.*;

public class CadastrosDeProdutos {
    public static void main(String[] args) {
        EntityManager em = new JPAUtil().getEntityManager();
        Categoria videogames = new Categoria("NOTEBOOK");
        Produto playstation = new Produto("Macbook Pro", "Caro", new BigDecimal("7000"), videogames);
        
        em.getTransaction().begin();

        em.persist(videogames);
        em.persist(playstation);

        em.getTransaction().commit();
        em.close();
    }
}
