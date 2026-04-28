package scot.oskar.enterpriseadvancedhytaleplugin.command;

import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.basecommands.AbstractPlayerCommand;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.World;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.GreetingRequest;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.factory.GreetingRequestFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.service.GreetingService;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.service.factory.GreetingServiceFactory;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.PlayerIdentity;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.factory.PlayerIdentityFactory;

public class EnterpriseAdvancedHytaleHelpCommand extends AbstractPlayerCommand {

  private final PlayerIdentityFactory playerIdentityFactory;
  private final GreetingRequestFactory greetingRequestFactory;
  private final GreetingServiceFactory greetingServiceFactory;

  public EnterpriseAdvancedHytaleHelpCommand(
      @Nonnull PlayerIdentityFactory playerIdentityFactory,
      @Nonnull GreetingRequestFactory greetingRequestFactory,
      @Nonnull GreetingServiceFactory greetingServiceFactory) {
    super("help", "Best enterprise help command");
    this.playerIdentityFactory = playerIdentityFactory;
    this.greetingRequestFactory = greetingRequestFactory;
    this.greetingServiceFactory = greetingServiceFactory;
  }

  @Override
  protected void execute(@Nonnull CommandContext commandContext, @Nonnull Store<EntityStore> store,
      @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world) {
    PlayerIdentity identity = playerIdentityFactory.from(playerRef);
    GreetingRequest request = greetingRequestFactory.create(identity, playerRef);
    GreetingService greetingService = greetingServiceFactory.create();
    greetingService.greet(request).block();
  }
}
