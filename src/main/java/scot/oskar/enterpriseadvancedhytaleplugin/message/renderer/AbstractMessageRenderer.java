package scot.oskar.enterpriseadvancedhytaleplugin.message.renderer;

import com.hypixel.hytale.server.core.Message;
import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.MessageContent;

public abstract class AbstractMessageRenderer implements MessageRenderer {

  @Override
  @Nonnull
  public abstract Message render(@Nonnull MessageContent content);
}
