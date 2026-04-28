package scot.oskar.enterpriseadvancedhytaleplugin.greeting.service;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer.GreetingComposer;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher.GreetingDispatcher;
import scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.factory.MessageRecipientFactory;

public final class EnterpriseGreetingService extends AbstractGreetingService {

  public EnterpriseGreetingService(@Nonnull GreetingComposer greetingComposer,
      @Nonnull GreetingDispatcher greetingDispatcher,
      @Nonnull MessageRecipientFactory messageRecipientFactory) {
    super(greetingComposer, greetingDispatcher, messageRecipientFactory);
  }
}
