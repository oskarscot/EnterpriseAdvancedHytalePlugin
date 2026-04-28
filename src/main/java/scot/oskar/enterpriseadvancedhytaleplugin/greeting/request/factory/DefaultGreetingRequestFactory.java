package scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.factory;

import com.hypixel.hytale.server.core.universe.PlayerRef;
import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.GreetingRequest;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.ImmutableGreetingRequest;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.PlayerIdentity;

public final class DefaultGreetingRequestFactory extends AbstractGreetingRequestFactory {

  @Override
  @Nonnull
  public GreetingRequest create(@Nonnull PlayerIdentity recipient, @Nonnull PlayerRef playerRef) {
    return ImmutableGreetingRequest.builder()
        .recipient(recipient)
        .playerRef(playerRef)
        .build();
  }
}
