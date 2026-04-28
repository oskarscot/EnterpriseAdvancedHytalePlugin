package scot.oskar.enterpriseadvancedhytaleplugin.message.renderer.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.message.renderer.MessageRenderer;
import scot.oskar.enterpriseadvancedhytaleplugin.message.renderer.RawTextMessageRenderer;

public final class RawTextMessageRendererFactory extends AbstractMessageRendererFactory {

  @Override
  @Nonnull
  public MessageRenderer create() {
    return new RawTextMessageRenderer();
  }
}
