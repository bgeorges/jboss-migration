package cz.fi.muni.jboss.Migration;

/**
 * Created with IntelliJ IDEA.
 * User: Roman Jakubco
 * Date: 10/7/12
 * Time: 3:43 PM
 */
public class CliScriptException extends Exception {
    CliScriptException(String message){
          super(message);
    }

    CliScriptException(String message, Throwable cause){
        super(message,cause);
    }
    CliScriptException(Throwable cause){
        super(cause);
    }
}
