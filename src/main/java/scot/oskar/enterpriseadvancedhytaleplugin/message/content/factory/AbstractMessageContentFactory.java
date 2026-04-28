package scot.oskar.enterpriseadvancedhytaleplugin.message.content.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.message.content.MessageContent;

public abstract class AbstractMessageContentFactory implements MessageContentFactory {

  @Override
  @Nonnull
  public abstract MessageContent create(@Nonnull String text);
}
