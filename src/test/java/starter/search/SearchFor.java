package starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchFor {

    public static Performable term(String term) {
        return Task.where("{0} attempts to search for #term",
                Enter.theValue(term).into(SearchForm.SEARCH_FIELD),
                Click.on(SearchForm.SEARCH_BUTTON)
        ).with("term").of(term);
    }
}