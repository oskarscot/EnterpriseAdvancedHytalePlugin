package scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher;

import javax.annotation.Nonnull;
import reactor.core.publisher.Mono;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.MessageContent;
import scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.MessageRecipient;

public interface GreetingDispatcher {

  @Nonnull
  Mono<Void> dispatch(@Nonnull MessageRecipient recipient, @Nonnull MessageContent content);
}
