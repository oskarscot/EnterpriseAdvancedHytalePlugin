package scot.oskar.enterpriseadvancedhytaleplugin.message.renderer.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.message.renderer.MessageRenderer;

public abstract class AbstractMessageRendererFactory implements MessageRendererFactory {

  @Override
  @Nonnull
  public abstract MessageRenderer create();
}
