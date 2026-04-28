package scot.oskar.enterpriseadvancedhytaleplugin.message.content;

import org.immutables.value.Value;

@Value.Immutable
public interface MessageContent {

  String text();
}
