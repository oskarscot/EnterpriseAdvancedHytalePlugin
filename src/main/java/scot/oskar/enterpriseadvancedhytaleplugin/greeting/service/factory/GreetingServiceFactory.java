package scot.oskar.enterpriseadvancedhytaleplugin.greeting.service.factory;

import javax.annotation.Nonnull;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.service.GreetingService;

public interface GreetingServiceFactory {

  @Nonnull
  GreetingService create();
}
