package io.github.gregiagu.pizza.builder.operation;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import io.github.gregiagu.pizza.builder.common.Pizza;
import io.github.gregiagu.pizza.builder.common.Topping;

public class PizzaBuilderTest {

    @Test
    void buildAnImplementedPizza() {
        final List<String> igs = Arrays.asList(new String[]{"Peperoni", "Cheese", "Tomato Sauce"});

        Topping top = new Topping() {

            @Override
            public List<String> getIgredients() {
                return igs;
            }
            
        };

        Pizza pizza = new PizzaBuilder()
            .withTopping(top)
            .build();

        assertThat(pizza.getToppings()).isEqualTo(top);
    }
}
