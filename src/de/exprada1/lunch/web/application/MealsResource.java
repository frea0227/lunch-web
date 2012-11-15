package de.exprada1.lunch.web.application;


import com.google.gson.Gson;
import org.joda.time.DateMidnight;
import org.restlet.resource.*;


public class MealsResource extends ServerResource {


    @SuppressWarnings("UnusedDeclaration")
    @Get("json")
    public String meals() {
        DateMidnight d = new DateMidnight(2012, 11, 19);
        Meal meal = new Meal("Schnitzel", 4.50, d.toDate());
        new MealDao().storeMeal(meal);

        return new Gson().toJson(new MealDao().readAll());
    }


}
