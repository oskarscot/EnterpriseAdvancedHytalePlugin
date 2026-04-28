package scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.GreetingRequest;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.factory.MessageContentFactory;

public final class HelloGreetingComposer extends AbstractGreetingComposer {

  public HelloGreetingComposer(@Nonnull MessageContentFactory messageContentFactory) {
    super(messageContentFactory);
  }

  @Override
  @Nonnull
  protected String composeText(@Nonnull GreetingRequest request) {
    return "Hello " + request.recipient().username();
  }
}
