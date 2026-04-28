package scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.composer.GreetingComposer;

public interface GreetingComposerFactory {

  @Nonnull
  GreetingComposer create();
}
