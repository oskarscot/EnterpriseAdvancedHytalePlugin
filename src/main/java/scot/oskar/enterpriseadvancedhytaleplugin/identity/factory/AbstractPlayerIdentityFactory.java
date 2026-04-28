package scot.oskar.enterpriseadvancedhytaleplugin.identity.factory;

import com.hypixel.hytale.server.core.universe.PlayerRef;
import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.PlayerIdentity;

public abstract class AbstractPlayerIdentityFactory implements PlayerIdentityFactory {

  @Override
  @Nonnull
  public final PlayerIdentity from(@Nonnull PlayerRef playerRef) {
    return create(playerRef.getUsername());
  }

  @Override
  @Nonnull
  public abstract PlayerIdentity create(@Nonnull String username);
}
