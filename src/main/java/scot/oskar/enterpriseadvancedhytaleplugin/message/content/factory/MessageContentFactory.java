package scot.oskar.enterpriseadvancedhytaleplugin.message.content.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.MessageContent;

public interface MessageContentFactory {

  @Nonnull
  MessageContent create(@Nonnull String text);
}
