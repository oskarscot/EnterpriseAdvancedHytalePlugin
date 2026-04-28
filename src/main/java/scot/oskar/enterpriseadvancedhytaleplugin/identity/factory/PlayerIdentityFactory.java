package scot.oskar.enterpriseadvancedhytaleplugin.identity.factory;

import com.hypixel.hytale.server.core.universe.PlayerRef;
import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.PlayerIdentity;

public interface PlayerIdentityFactory {

  @Nonnull
  PlayerIdentity create(@Nonnull String username);

  @Nonnull
  PlayerIdentity from(@Nonnull PlayerRef playerRef);
}
