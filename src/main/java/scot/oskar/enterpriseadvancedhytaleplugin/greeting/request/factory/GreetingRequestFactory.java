package scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.factory;

import com.hypixel.hytale.server.core.universe.PlayerRef;
import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.GreetingRequest;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.PlayerIdentity;

public interface GreetingRequestFactory {

  @Nonnull
  GreetingRequest create(@Nonnull PlayerIdentity recipient, @Nonnull PlayerRef playerRef);
}
