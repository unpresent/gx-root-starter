package ru.gx.common.worker;

import org.jetbrains.annotations.NotNull;

public class SimpleStoppingExecuteEvent extends AbstractStoppingExecuteEvent {
    public SimpleStoppingExecuteEvent(@NotNull final Object source) {
        super(source);
    }
}
