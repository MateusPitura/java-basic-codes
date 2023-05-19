package br.com.mateus.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;

import br.com.mateus.modelo.*;
import br.com.mateus.util.JPAUtil;
import br.com.mateus.vo.RelatorioDeVendasVo;

public class CadastroDePedido {
    public static void main(String[] args) {
        EntityManager em = new JPAUtil().getEntityManager();
        Produto produto = em.find(Produto.class, 4l);

        em.getTransaction().begin();

        // Cliente cliente = new Cliente("Caio", "123456");
        // em.persist(cliente);
        // Pedido pedido = new Pedido(cliente);
        // pedido.adicionarItem(new ItemPedido(6, pedido, produto));
        // em.persist(pedido); 

        // em.getTransaction().commit();

        // String jpql = "SELECT SUM(p.valorTotal) FROM Pedido p";
        // BigDecimal totalVendido = em.createQuery(jpql, BigDecimal.class).getSingleResult();
        // System.out.println(totalVendido);

        String jpql = "SELECT new br.com.mateus.vo.RelatorioDeVendasVo(produto.nome, SUM(item.quantidade), MAX(pedido.data)) "
                      + "FROM Pedido pedido JOIN pedido.itens item JOIN item.produto produto "
                      + "GROUP BY produto.nome ";
        List<RelatorioDeVendasVo> relatorio = em.createQuery(jpql, RelatorioDeVendasVo.class).getResultList();
        relatorio.forEach(item -> {
            System.out.println(item);
        });

        em.close();
    }
}
