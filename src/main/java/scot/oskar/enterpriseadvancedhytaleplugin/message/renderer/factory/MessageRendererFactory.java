package scot.oskar.enterpriseadvancedhytaleplugin.message.renderer.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.message.renderer.MessageRenderer;

public interface MessageRendererFactory {

  @Nonnull
  MessageRenderer create();
}
