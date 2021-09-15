package co.com.choucair.certification.proyectobase.Question;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {
    private String questions;

    public Answer(String questions) {
        this.questions = questions;
    }

    public static Answer toThe (String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String nameCourse= Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if (questions.equals(nameCourse)){
            result= true;
        } else {
            result= false;
        }
        return result;
    }
}
