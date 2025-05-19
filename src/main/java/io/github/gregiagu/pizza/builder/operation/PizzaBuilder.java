package io.github.gregiagu.pizza.builder.operation;

import io.github.gregiagu.pizza.builder.common.Pizza;
import io.github.gregiagu.pizza.builder.common.Topping;

public class PizzaBuilder {

    protected Topping t = null;

    public Pizza build() {
        return new PizzaImpl(t);
    }

    public PizzaBuilder withTopping(Topping t) {
        this.t = t;
        return this;
    }
}
