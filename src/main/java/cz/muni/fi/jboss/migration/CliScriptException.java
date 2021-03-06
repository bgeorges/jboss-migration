package cz.muni.fi.jboss.migration;

/**
 * Class for expression which will be thrown in case of error in CliScriptImpl
 *
 * @author Roman Jakubco
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
