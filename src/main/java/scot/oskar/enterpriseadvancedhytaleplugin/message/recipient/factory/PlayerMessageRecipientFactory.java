package scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.factory;

import com.hypixel.hytale.server.core.universe.PlayerRef;
import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.PlayerIdentity;
import scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.MessageRecipient;
import scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.PlayerMessageRecipient;

public final class PlayerMessageRecipientFactory extends AbstractMessageRecipientFactory {

  @Override
  @Nonnull
  public MessageRecipient create(@Nonnull PlayerIdentity identity, @Nonnull PlayerRef playerRef) {
    return new PlayerMessageRecipient(identity, playerRef);
  }
}
