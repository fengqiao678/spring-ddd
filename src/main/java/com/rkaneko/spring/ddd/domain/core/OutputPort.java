package com.rkaneko.spring.ddd.domain.core;

/**
 *  <pre>
 * The clean architecture's output port interface.
 * </pre>
 * @param <Args>
 * @param <Out>
 */
public interface OutputPort<Args, Out> {

    /**
     * <pre>
     * The callback which invoked by the response message converter (belongs to the framework).
     * </pre>
     * @param args Arguments received from usecases.
     * @return The view model included in the response.
     */
    Out callback(Args args);
}
