package examples;

import com.intuit.karate.junit4.Karate;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
public class ExamplesTest {
    // this will run all *.feature files that exist in sub-directories
    // refer to https://github.com/intuit/karate#naming-conventions
    // for folder-structure recommendations and naming conventions

    @AfterClass
    public static void openHtmlReport() {
        // file:///C:/Users/thirdy/IdeaProjects/checkingout/target/surefire-reports/TEST-examples.users.users.html
    }
}