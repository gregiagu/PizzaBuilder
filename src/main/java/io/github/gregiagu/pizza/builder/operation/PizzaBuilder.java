package io.github.gregiagu.pizza.builder.operation;

import io.github.gregiagu.pizza.builder.common.Pizza;

public class PizzaBuilder {

    protected String t = "";

    public Pizza build() {
        return new Pizza() {

            private String topping = t;
            @Override
            public String getToppins() {
                return topping;
            }
            
        };
    }

    public PizzaBuilder withTopping(String t) {
        this.t = t;
        return this;
    }
}
