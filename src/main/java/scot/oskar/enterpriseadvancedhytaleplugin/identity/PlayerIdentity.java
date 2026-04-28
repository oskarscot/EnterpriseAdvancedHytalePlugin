package scot.oskar.enterpriseadvancedhytaleplugin.identity;

import org.immutables.value.Value;

@Value.Immutable
public interface PlayerIdentity {

  String username();
}
