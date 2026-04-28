package scot.oskar.enterpriseadvancedhytaleplugin.greeting.service.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer.factory.GreetingComposerFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher.factory.GreetingDispatcherFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.service.EnterpriseGreetingService;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.service.GreetingService;
import scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.factory.MessageRecipientFactory;

public final class EnterpriseGreetingServiceFactory extends AbstractGreetingServiceFactory {

  public EnterpriseGreetingServiceFactory(
      @Nonnull GreetingComposerFactory greetingComposerFactory,
      @Nonnull GreetingDispatcherFactory greetingDispatcherFactory,
      @Nonnull MessageRecipientFactory messageRecipientFactory) {
    super(greetingComposerFactory, greetingDispatcherFactory, messageRecipientFactory);
  }

  @Override
  @Nonnull
  public GreetingService create() {
    return new EnterpriseGreetingService(
        greetingComposerFactory().create(),
        greetingDispatcherFactory().create(),
        messageRecipientFactory());
  }
}
