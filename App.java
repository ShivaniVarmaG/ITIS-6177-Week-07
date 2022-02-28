package example;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Handler for requests to Lambda function.
 */
public class App implements RequestHandler<App.Payload, String> {

    @Override
    public String handleRequest(Payload event, Context context) {
        return "Shivani Varma says " + event.getKeyword() ;
    }

    static class Payload{

        private String keyword;

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }
    }

}