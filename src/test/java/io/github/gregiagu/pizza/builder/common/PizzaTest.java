package io.github.gregiagu.pizza.builder.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PizzaTest {

    /**
     * Mocking an interface to use it as a type.
     */
    @Test
    void mockPizzaTest() {
        List<String> igs = Arrays.asList("Peperoni", "Cheese", "Tomato sauce");

        Topping t = new Topping() {

            @Override
            public List<String> getIgredients() {
                return igs;
            }
        };

        Pizza pt = new Pizza() {

            private Topping topping = t;;

            @Override
            public Topping getToppings() {
                return this.topping;
            }

        };
        Pizza pizzaMock = mock(Pizza.class);
        when(pizzaMock.getToppings()).thenReturn(t);
        assertThat(pizzaMock.getToppings()).isEqualTo(t);
    }
}
