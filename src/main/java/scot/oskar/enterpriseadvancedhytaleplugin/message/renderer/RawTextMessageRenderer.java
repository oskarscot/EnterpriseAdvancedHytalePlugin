package scot.oskar.enterpriseadvancedhytaleplugin.message.renderer;

import com.hypixel.hytale.server.core.Message;
import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.MessageContent;

public final class RawTextMessageRenderer extends AbstractMessageRenderer {

  @Override
  @Nonnull
  public Message render(@Nonnull MessageContent content) {
    return Message.raw(content.text());
  }
}
