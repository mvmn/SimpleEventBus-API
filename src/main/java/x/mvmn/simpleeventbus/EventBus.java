package x.mvmn.simpleeventbus;

import x.mvmn.lang.ExceptionHandler;

public interface EventBus {

	public EventListener<? extends AbstractEvent> registerEventListener(Class<? extends AbstractEvent> eventClass,
			EventListener<? extends AbstractEvent> listener);

	public EventListener<? extends AbstractEvent> registerEventListener(Class<? extends AbstractEvent> eventClass,
			EventListener<? extends AbstractEvent> listener, ExceptionHandler<Throwable> eventHandlingErrorHandler);

	public AbstractEvent fireEventOfAutodetectedType(AbstractEvent event);

	public AbstractEvent fireEventOfExactType(Class<? extends AbstractEvent> eventClass, AbstractEvent event);

	public AbstractEvent fireEventOfThisOrParentType(Class<? extends AbstractEvent> eventClass, AbstractEvent event);

	public AbstractEvent fireEventOfAutodetectedType(AbstractEvent event, ExceptionHandler<Throwable> eventHandlingErrorHandler);

	public AbstractEvent fireEventOfExactType(Class<? extends AbstractEvent> eventClass, AbstractEvent event,
			ExceptionHandler<Throwable> eventHandlingErrorHandler);

	public AbstractEvent fireEventOfThisOrParentType(Class<? extends AbstractEvent> eventClass, AbstractEvent event,
			ExceptionHandler<Throwable> eventHandlingErrorHandler);
}
