package br.com.mateus.testes;

import javax.persistence.*;

import br.com.mateus.modelo.*;
import br.com.mateus.util.JPAUtil;

public class CadastroDePedido {
    public static void main(String[] args) {
        EntityManager em = new JPAUtil().getEntityManager();
        Produto produto = em.find(Produto.class, 1l);

        em.getTransaction().begin();

        Cliente cliente = new Cliente("Rodrigo", "123456");
        em.persist(cliente);
        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(new ItemPedido(10, pedido, produto));
        em.persist(pedido);

        em.getTransaction().commit();
        em.close();
    }
}
