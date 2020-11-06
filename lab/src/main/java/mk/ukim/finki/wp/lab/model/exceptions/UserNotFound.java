package mk.ukim.finki.wp.lab.model.exceptions;

public class UserNotFound extends RuntimeException{

    public UserNotFound(){
        super("There is no user with that username");
    }
}
