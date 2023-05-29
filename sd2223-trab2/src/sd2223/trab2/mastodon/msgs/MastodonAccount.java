package sd2223.trab2.mastodon.msgs;

public record MastodonAccount(String id, String username) {

    public long getIdMastodon() {
        return Long.valueOf(id);
    }

    public String getUsernameMastodon(){
        return username;
    }

}
