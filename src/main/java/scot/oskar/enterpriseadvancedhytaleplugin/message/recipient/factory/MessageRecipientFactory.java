package scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.factory;

import com.hypixel.hytale.server.core.universe.PlayerRef;
import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.PlayerIdentity;
import scot.oskar.enterpriseadvancedhytaleplugin.message.recipient.MessageRecipient;

public interface MessageRecipientFactory {

  @Nonnull
  MessageRecipient create(@Nonnull PlayerIdentity identity, @Nonnull PlayerRef playerRef);
}
