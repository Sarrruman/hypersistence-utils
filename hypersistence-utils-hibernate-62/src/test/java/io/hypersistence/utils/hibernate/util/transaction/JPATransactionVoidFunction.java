package io.hypersistence.utils.hibernate.util.transaction;

import jakarta.persistence.EntityManager;

import java.util.function.Consumer;

/**
 * @author Vlad Mihalcea
 */
@FunctionalInterface
public interface JPATransactionVoidFunction extends Consumer<EntityManager> {
    default void beforeTransactionCompletion() {

    }

    default void afterTransactionCompletion() {

    }
}
