package scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.GreetingRequest;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.MessageContent;

public interface GreetingComposer {

  @Nonnull
  MessageContent compose(@Nonnull GreetingRequest request);
}
