package br.com.mateus.util;

import javax.persistence.*;

public class JPAUtil {
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("loja");
    
    public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
    }
}
