package io.github.gregiagu.pizza.builder.operation;

import io.github.gregiagu.pizza.builder.common.Pizza;
import io.github.gregiagu.pizza.builder.common.Topping;

public class PizzaImpl
implements Pizza {

    protected PizzaImpl(Topping topping) {
        this.topping = topping;
    }

    private final Topping topping;

    @Override
    public Topping getToppings() {
        return this.topping;
    }

}
