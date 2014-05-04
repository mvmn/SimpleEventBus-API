package x.mvmn.simpleeventbus;

public interface EventListener<T extends AbstractEvent> {

	public void handleEvent(T event);
}
