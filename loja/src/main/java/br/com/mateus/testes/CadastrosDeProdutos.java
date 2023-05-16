package br.com.mateus.testes;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import br.com.mateus.util.JPAUtil;
import br.com.mateus.modelo.*;

public class CadastrosDeProdutos {
    public static void main(String[] args) {
        EntityManager em = new JPAUtil().getEntityManager();
        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto("Xiomi Redmi", "Muito Legal", new BigDecimal("800"), celulares);
        
        em.getTransaction().begin();

        em.persist(celulares);
        em.persist(celular);

        em.getTransaction().commit();
        em.close();
    }
}
