package com.kumuluz.ee.jpa.common.resources;

import org.jboss.weld.injection.spi.ResourceReference;

import javax.persistence.EntityManager;

/**
 * @author Tilen Faganel
 * @since 1.0.0
 */
public class PersistenceContextResource implements ResourceReference<EntityManager> {

    private final EntityManager em;

    public PersistenceContextResource(EntityManager em) {

        this.em = em;
    }

    @Override
    public EntityManager getInstance() {

        return em;
    }

    @Override
    public void release() {

        em.close();
    }
}
