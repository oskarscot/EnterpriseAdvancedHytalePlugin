package scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer.GreetingComposer;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.factory.MessageContentFactory;

public abstract class AbstractGreetingComposerFactory implements GreetingComposerFactory {

  private final MessageContentFactory messageContentFactory;

  protected AbstractGreetingComposerFactory(@Nonnull MessageContentFactory messageContentFactory) {
    this.messageContentFactory = messageContentFactory;
  }

  @Nonnull
  protected final MessageContentFactory messageContentFactory() {
    return messageContentFactory;
  }

  @Override
  @Nonnull
  public abstract GreetingComposer create();
}
