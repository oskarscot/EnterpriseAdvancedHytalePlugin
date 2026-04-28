package scot.oskar.enterpriseadvancedhytaleplugin.message.recipient;

import com.hypixel.hytale.server.core.Message;
import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.PlayerIdentity;

public interface MessageRecipient {

  @Nonnull
  PlayerIdentity identity();

  void deliver(@Nonnull Message message);
}
