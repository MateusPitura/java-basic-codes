package br.com.mateus.util;

import javax.persistence.*;

public class JPAUtil {
    private final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("loja");
    
    public EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
    }
}
