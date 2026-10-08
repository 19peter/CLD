package org.cldplatform.global.eventbus;

import org.cldplatform.infra.runtimes.RuntimeInterface;
import org.cldplatform.shared.enums.Events;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

public class EventBus {
    public record Event(Events event, RuntimeInterface service) {}

    private static final List<Consumer<Event>> listeners = new CopyOnWriteArrayList<>();

    public static void subscribe(Consumer<Event> listener) {
        listeners.add(listener);
    }

    public static void publish(Event event) {
        for (Consumer<Event> listener : listeners) {
            listener.accept(event);
        }
    }
}
