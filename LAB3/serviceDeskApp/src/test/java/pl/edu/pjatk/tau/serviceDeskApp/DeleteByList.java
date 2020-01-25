package pl.edu.pjatk.tau.serviceDeskApp;

import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryPathResolver;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import pl.edu.pjatk.tau.serviceDeskApp.JBehave.JBehaveSteps;

public class DeleteByList extends JUnitStory {

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                // where to find the stories
                .useStoryPathResolver(new StoryPathResolver() {
                    @Override
                    public String resolve(Class<? extends Embeddable> aClass) {
                        return "/Users/michalwolowiec/Documents/TAU/LAB3/serviceDeskApp/src/test/java/pl/edu/pjatk/tau/serviceDeskApp/JBehave/DeleteByList.story";
                    }
                })
                
                // CONSOLE and TXT reporting
                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT));
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        // varargs, can have more that one steps classes
        return new InstanceStepsFactory(configuration(), new JBehaveSteps());
    }
}
