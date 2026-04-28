package scot.oskar.enterpriseadvancedhytaleplugin.identity.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.ImmutablePlayerIdentity;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.PlayerIdentity;

public final class DefaultPlayerIdentityFactory extends AbstractPlayerIdentityFactory {

  @Override
  @Nonnull
  public PlayerIdentity create(@Nonnull String username) {
    return ImmutablePlayerIdentity.builder()
        .username(username)
        .build();
  }
}
