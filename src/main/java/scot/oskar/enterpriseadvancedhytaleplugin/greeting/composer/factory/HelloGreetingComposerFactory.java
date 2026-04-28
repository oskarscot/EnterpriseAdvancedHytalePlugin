package scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer.GreetingComposer;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer.HelloGreetingComposer;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.factory.MessageContentFactory;

public final class HelloGreetingComposerFactory extends AbstractGreetingComposerFactory {

  public HelloGreetingComposerFactory(@Nonnull MessageContentFactory messageContentFactory) {
    super(messageContentFactory);
  }

  @Override
  @Nonnull
  public GreetingComposer create() {
    return new HelloGreetingComposer(messageContentFactory());
  }
}
