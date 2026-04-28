package scot.oskar.enterpriseadvancedhytaleplugin.message.content.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.ImmutableMessageContent;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.MessageContent;

public final class PlainTextMessageContentFactory extends AbstractMessageContentFactory {

  @Override
  @Nonnull
  public MessageContent create(@Nonnull String text) {
    return ImmutableMessageContent.builder()
        .text(text)
        .build();
  }
}
