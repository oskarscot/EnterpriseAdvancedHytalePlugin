package scot.oskar.enterpriseadvancedhytaleplugin.message.recipient;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.PlayerIdentity;

public final class PlayerMessageRecipient extends AbstractMessageRecipient {

  private final PlayerRef playerRef;

  public PlayerMessageRecipient(@Nonnull PlayerIdentity identity, @Nonnull PlayerRef playerRef) {
    super(identity);
    this.playerRef = playerRef;
  }

  @Override
  public void deliver(@Nonnull Message message) {
    playerRef.sendMessage(message);
  }
}
