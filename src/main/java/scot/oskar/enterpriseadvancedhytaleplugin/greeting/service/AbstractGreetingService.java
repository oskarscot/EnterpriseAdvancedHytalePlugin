package scot.oskar.enterpriseadvancedhytaleplugin.greeting.service;

import javax.annotation.Nonnull;
import reactor.core.publisher.Mono;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer.GreetingComposer;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher.GreetingDispatcher;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.GreetingRequest;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.MessageContent;
import scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.MessageRecipient;
import scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.factory.MessageRecipientFactory;

public abstract class AbstractGreetingService implements GreetingService {

  private final GreetingComposer greetingComposer;
  private final GreetingDispatcher greetingDispatcher;
  private final MessageRecipientFactory messageRecipientFactory;

  protected AbstractGreetingService(@Nonnull GreetingComposer greetingComposer,
      @Nonnull GreetingDispatcher greetingDispatcher,
      @Nonnull MessageRecipientFactory messageRecipientFactory) {
    this.greetingComposer = greetingComposer;
    this.greetingDispatcher = greetingDispatcher;
    this.messageRecipientFactory = messageRecipientFactory;
  }

  @Override
  @Nonnull
  public final Mono<Void> greet(@Nonnull GreetingRequest request) {
    MessageContent content = greetingComposer.compose(request);
    MessageRecipient recipient = messageRecipientFactory.create(request.recipient(),
        request.playerRef());
    return greetingDispatcher.dispatch(recipient, content);
  }
}
