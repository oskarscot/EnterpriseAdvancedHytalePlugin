package scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher.GreetingDispatcher;

public interface GreetingDispatcherFactory {

  @Nonnull
  GreetingDispatcher create();
}
