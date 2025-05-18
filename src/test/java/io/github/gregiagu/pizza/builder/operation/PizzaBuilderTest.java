package io.github.gregiagu.pizza.builder.operation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import io.github.gregiagu.pizza.builder.common.Pizza;

public class PizzaBuilderTest {

    @Test
    void buildAnImplementedPizza() {
        String top = "Peperoni";

        Pizza pizza = new PizzaBuilder()
            .withTopping(top)
            .build();

        assertThat(pizza.getToppins()).isEqualTo(top);
    }
}
