package com.rkaneko.spring.ddd.domain.core;

/**
 * <pre>
 * The clean architecture's output port interface.
 * </pre>
 * @param <In>
 * @param <Out>
 */
public interface InputPort<In, Out> {
    /**
     * <pre>
     * Convert the input form received from outside to the input to send usecases
     * , and invoke usecases' actions.
     * </pre>
     * @param inputForm
     * @return
     */
    Out run(In inputForm);
}