package scot.oskar.enterpriseadvancedhytaleplugin.greeting.request;

import com.hypixel.hytale.server.core.universe.PlayerRef;
import org.immutables.value.Value;
import scot.oskar.enterpriseadvancedhytaleplugin.identity.PlayerIdentity;

@Value.Immutable
public interface GreetingRequest {

  PlayerIdentity recipient();

  PlayerRef playerRef();
}
