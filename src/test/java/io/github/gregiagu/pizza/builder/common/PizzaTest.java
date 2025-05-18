package io.github.gregiagu.pizza.builder.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class PizzaTest {

    /**
     * Mocking an interface to use it as a type.
     */
    @Test
    void mockPizzaTest() {
        String t = "A flavoured topping";
        Pizza pizzaMock = mock(Pizza.class);
        when(pizzaMock.getToppins()).thenReturn(t);
        assertThat(pizzaMock.getToppins()).isNotBlank().isEqualTo(t);
    }
}
