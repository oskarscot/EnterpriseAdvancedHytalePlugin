package scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.message.renderer.MessageRenderer;

public final class DefaultGreetingDispatcher extends AbstractGreetingDispatcher {

  public DefaultGreetingDispatcher(@Nonnull MessageRenderer messageRenderer) {
    super(messageRenderer);
  }
}
