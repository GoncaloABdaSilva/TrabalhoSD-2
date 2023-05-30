package sd2223.trab2.mastodon.msgs;

import sd2223.trab2.api.Message;
import sd2223.trab2.servers.Domain;

import java.time.OffsetDateTime;


public record PostStatusResult(String id, String content, String created_at, MastodonAccount account) {
	
	public long getId() {
		return Long.valueOf(id);
	}
	long getCreationTime() {
		return OffsetDateTime.parse(created_at).toInstant().toEpochMilli();
	}
	
	public String getText() {
		return content.substring(3, content.length() - 4);
	}
	
	public Message toMessage() {
		var m = new Message( getId(), account.username(), Domain.get(), getText());
		m.setCreationTime( getCreationTime() );
		return m;
	}
}