package scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher.GreetingDispatcher;
import scot.oskar.enterpriseadvancedhytaleplugin.message.renderer.factory.MessageRendererFactory;

public abstract class AbstractGreetingDispatcherFactory implements GreetingDispatcherFactory {

  private final MessageRendererFactory messageRendererFactory;

  protected AbstractGreetingDispatcherFactory(
      @Nonnull MessageRendererFactory messageRendererFactory) {
    this.messageRendererFactory = messageRendererFactory;
  }

  @Nonnull
  protected final MessageRendererFactory messageRendererFactory() {
    return messageRendererFactory;
  }

  @Override
  @Nonnull
  public abstract GreetingDispatcher create();
}
