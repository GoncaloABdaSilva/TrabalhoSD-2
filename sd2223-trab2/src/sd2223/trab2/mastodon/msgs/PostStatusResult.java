package sd2223.trab2.mastodon.msgs;

import sd2223.trab2.api.Message;

import java.time.OffsetDateTime;

public record PostStatusResult(String id, String content, String created_at, MastodonAccount account) {
	
	public long getId() {
		return Long.valueOf(id);
	}
	long getCreationTime() {
		return OffsetDateTime.parse(created_at).toInstant().toEpochMilli();
	}
	
	public String getText() {
		return content;
	}
	
	public Message toMessage() {
		var m = new Message( getId(), "todo", "todo", getText());
		m.setCreationTime( getCreationTime() );
		return m;
	}
}