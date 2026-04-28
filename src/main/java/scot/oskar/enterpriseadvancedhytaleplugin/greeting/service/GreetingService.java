package scot.oskar.enterpriseadvancedhytaleplugin.greeting.service;

import javax.annotation.Nonnull;
import reactor.core.publisher.Mono;
import scot.oskar.enterpriseadvancedhytaleplugin.greeting.request.GreetingRequest;

public interface GreetingService {

  @Nonnull
  Mono<Void> greet(@Nonnull GreetingRequest request);
}
