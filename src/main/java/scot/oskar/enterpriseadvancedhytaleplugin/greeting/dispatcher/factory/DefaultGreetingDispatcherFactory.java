package scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher.DefaultGreetingDispatcher;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher.GreetingDispatcher;
import scot.oskar.enterpriseadvancedhytaleplugin.message.renderer.factory.MessageRendererFactory;

public final class DefaultGreetingDispatcherFactory extends AbstractGreetingDispatcherFactory {

  public DefaultGreetingDispatcherFactory(
      @Nonnull MessageRendererFactory messageRendererFactory) {
    super(messageRendererFactory);
  }

  @Override
  @Nonnull
  public GreetingDispatcher create() {
    return new DefaultGreetingDispatcher(messageRendererFactory().create());
  }
}
