package scot.oskar.enterpriseadvancedhytaleplugin.message.recipient;

import com.hypixel.hytale.server.core.Message;
import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.PlayerIdentity;

public abstract class AbstractMessageRecipient implements MessageRecipient {

  private final PlayerIdentity identity;

  protected AbstractMessageRecipient(@Nonnull PlayerIdentity identity) {
    this.identity = identity;
  }

  @Override
  @Nonnull
  public final PlayerIdentity identity() {
    return identity;
  }

  @Override
  public abstract void deliver(@Nonnull Message message);
}
