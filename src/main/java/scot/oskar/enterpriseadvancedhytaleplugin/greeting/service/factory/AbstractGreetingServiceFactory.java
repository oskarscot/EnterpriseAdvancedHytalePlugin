package scot.oskar.enterpriseadvancedhytaleplugin.greeting.service.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer.factory.GreetingComposerFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher.factory.GreetingDispatcherFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.service.GreetingService;
import scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.factory.MessageRecipientFactory;

public abstract class AbstractGreetingServiceFactory implements GreetingServiceFactory {

  private final GreetingComposerFactory greetingComposerFactory;
  private final GreetingDispatcherFactory greetingDispatcherFactory;
  private final MessageRecipientFactory messageRecipientFactory;

  protected AbstractGreetingServiceFactory(
      @Nonnull GreetingComposerFactory greetingComposerFactory,
      @Nonnull GreetingDispatcherFactory greetingDispatcherFactory,
      @Nonnull MessageRecipientFactory messageRecipientFactory) {
    this.greetingComposerFactory = greetingComposerFactory;
    this.greetingDispatcherFactory = greetingDispatcherFactory;
    this.messageRecipientFactory = messageRecipientFactory;
  }

  @Nonnull
  protected final GreetingComposerFactory greetingComposerFactory() {
    return greetingComposerFactory;
  }

  @Nonnull
  protected final GreetingDispatcherFactory greetingDispatcherFactory() {
    return greetingDispatcherFactory;
  }

  @Nonnull
  protected final MessageRecipientFactory messageRecipientFactory() {
    return messageRecipientFactory;
  }

  @Override
  @Nonnull
  public abstract GreetingService create();
}
