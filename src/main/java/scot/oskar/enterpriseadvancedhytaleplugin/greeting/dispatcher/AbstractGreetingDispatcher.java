package scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher;

import com.hypixel.hytale.server.core.Message;
import javax.annotation.Nonnull;
import reactor.core.publisher.Mono;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.MessageContent;
import scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.MessageRecipient;
import scot.oskar.enterpriseadvancedhytaleplugin.message.renderer.MessageRenderer;

public abstract class AbstractGreetingDispatcher implements GreetingDispatcher {

  private final MessageRenderer messageRenderer;

  protected AbstractGreetingDispatcher(@Nonnull MessageRenderer messageRenderer) {
    this.messageRenderer = messageRenderer;
  }

  @Override
  @Nonnull
  public final Mono<Void> dispatch(@Nonnull MessageRecipient recipient,
      @Nonnull MessageContent content) {
    Message rendered = messageRenderer.render(content);
    return Mono.fromRunnable(() -> recipient.deliver(rendered));
  }
}
