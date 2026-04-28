package scot.oskar.enterpriseadvancedhytaleplugin.message.renderer;

import com.hypixel.hytale.server.core.Message;
import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.MessageContent;

public interface MessageRenderer {

  @Nonnull
  Message render(@Nonnull MessageContent content);
}
