package scot.oskar.enterpriseadvancedhytaleplugin;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import javax.annotation.Nonnull;
import reactor.core.publisher.Mono;
import scot.oskar.enterpriseadvancedhytaleplugin.command.EnterpriseAdvancedHytaleHelpCommand;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer.factory.GreetingComposerFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer.factory.HelloGreetingComposerFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher.factory.DefaultGreetingDispatcherFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.dispatcher.factory.GreetingDispatcherFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.factory.DefaultGreetingRequestFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.factory.GreetingRequestFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.service.factory.EnterpriseGreetingServiceFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.service.factory.GreetingServiceFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.factory.DefaultPlayerIdentityFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.factory.PlayerIdentityFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.factory.MessageContentFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.factory.PlainTextMessageContentFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.factory.MessageRecipientFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.factory.PlayerMessageRecipientFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.message.renderer.factory.MessageRendererFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.message.renderer.factory.RawTextMessageRendererFactory;

public class EnterpriseAdvancedHytalePlugin extends JavaPlugin {

  public EnterpriseAdvancedHytalePlugin(@Nonnull JavaPluginInit init) {
    super(init);
  }

  @Override
  protected void setup() {
    Mono.fromRunnable(this::enterpriseSetup).block();
  }

  private void enterpriseSetup() {
    PlayerIdentityFactory playerIdentityFactory = new DefaultPlayerIdentityFactory();
    MessageContentFactory messageContentFactory = new PlainTextMessageContentFactory();
    MessageRendererFactory messageRendererFactory = new RawTextMessageRendererFactory();
    MessageRecipientFactory messageRecipientFactory = new PlayerMessageRecipientFactory();
    GreetingRequestFactory greetingRequestFactory = new DefaultGreetingRequestFactory();
    GreetingComposerFactory greetingComposerFactory = new HelloGreetingComposerFactory(messageContentFactory);
    GreetingDispatcherFactory greetingDispatcherFactory = new DefaultGreetingDispatcherFactory(messageRendererFactory);
    GreetingServiceFactory greetingServiceFactory = new EnterpriseGreetingServiceFactory(greetingComposerFactory, greetingDispatcherFactory, messageRecipientFactory);

    this.getCommandRegistry().registerCommand(new EnterpriseAdvancedHytaleHelpCommand(playerIdentityFactory, greetingRequestFactory, greetingServiceFactory));
  }
}
