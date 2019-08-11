package lt.sdacademy.hashmap;

import java.util.Objects;

public class Message {
    private final User sender;
    private final String text;

    public Message(User sender, String text) {
        this.sender = sender;
        this.text = text;
    }

    public User getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(sender, message.sender) &&
                Objects.equals(text, message.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, text);
    }

  public class Like {
        private User user;
        public Like(User user){
            this.user= user;

        }
        public User getUser(){
            return user;
        }
        public String getText() {
            return text;

        }
    }
}
