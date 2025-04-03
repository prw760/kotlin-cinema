import org.hyperskill.hstest.dynamic.DynamicTest;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;
import org.hyperskill.hstest.testing.TestedProgram;

public class CinemaTests extends StageTest<String> {

    @DynamicTest
    CheckResult test() {

        TestedProgram program = new TestedProgram();
        String output = program.start().strip();

        String[] splittedOutput = output.split("\n");

        if (splittedOutput.length != 9) {
            return CheckResult.wrong("Expected 9 lines in the output!");
        }

        String firstLine = splittedOutput[0].replace(" ", "");
        if (!firstLine.equals("Cinema:")) {
            return CheckResult.wrong("The first line should be 'Cinema:'");
        }

        String secondLine = splittedOutput[1].trim();

        if (!secondLine.equals("1 2 3 4 5 6 7 8")) {
            return CheckResult.wrong("The second line should be \"  1 2 3 4 5 6 7 8\"");
        }

        for (int i = 2; i < 9; i++) {

            String errorMessage = "The ";
            if (i == 2) {
                errorMessage += "third ";
            } else {
                errorMessage += i + "th ";
            }

            errorMessage += "line ";

            if (!splittedOutput[i].contains("" + (i - 1))) {

                errorMessage += "should start with \"" + (i - 1) + "\"";

                return CheckResult.wrong(errorMessage);
            }

            String line = splittedOutput[i].replace("" + (i - 1), "").trim();

            if (!line.equals("S S S S S S S S")) {

                errorMessage += "should be \"" + (i - 1) + " S S S S S S S S\"";

                return CheckResult.wrong(errorMessage);
            }
        }

        return CheckResult.correct();
    }
}
