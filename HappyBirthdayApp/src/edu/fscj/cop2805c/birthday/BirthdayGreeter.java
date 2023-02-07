package edu.fscj.cop2805c.birthday;

public interface BirthdayGreeter {
    // build a birthday card
    public String buildCard(String msg);
    // send a birthday card
    public void sendCard(User u);
}
