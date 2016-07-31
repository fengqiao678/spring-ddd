package com.rkaneko.spring.ddd.domain.core;

/**
 * <pre>
 * The clean architecture's usecase interface
 * </pre>
 * @param <Args>
 * @param <Result>
 */
public interface Usecase<Args, Result> {

    /**
     * <pre>x
     * Execute the domain logic and return the presenter.
     * </pre>
     * @param args Args must be some domain model instance.
     * @return
     */
    Result execute(Args args);
}
