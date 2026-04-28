package scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.GreetingRequest;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.MessageContent;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.factory.MessageContentFactory;

public abstract class AbstractGreetingComposer implements GreetingComposer {

  private final MessageContentFactory messageContentFactory;

  protected AbstractGreetingComposer(@Nonnull MessageContentFactory messageContentFactory) {
    this.messageContentFactory = messageContentFactory;
  }

  @Override
  @Nonnull
  public final MessageContent compose(@Nonnull GreetingRequest request) {
    return messageContentFactory.create(composeText(request));
  }

  @Nonnull
  protected abstract String composeText(@Nonnull GreetingRequest request);
}
