package de.exprada1.lunch.web.application;


import com.google.appengine.api.datastore.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class MealDao {
    public void storeMeal(Meal meal) {
        meal.setGuid(UUID.randomUUID().toString());

        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

        Entity entity = new Entity("Meal", meal.getGuid());
        entity.setProperty("name", meal.getName());
        entity.setProperty("date", meal.getDate());
        entity.setProperty("price", meal.getPrice());

        datastore.put(entity);
    }

    public List<Meal> readAll() {
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        Query photoQuery = new Query("Meal");


        List<Entity> results = datastore.prepare(photoQuery)
                .asList(FetchOptions.Builder.withDefaults());
        return fromEntities(results);
    }

    private List<Meal> fromEntities(List<Entity> entities) {
        List<Meal> ret = new ArrayList<Meal>(entities.size());
        for (Entity e : entities) {
            Meal m = new Meal();
            m.setGuid(e.getKey().toString());
            m.setDate((Date)e.getProperty("date"));
            m.setPrice((Double)e.getProperty("price"));
            m.setName((String)e.getProperty("name"));
            ret.add(m);
        }
        return ret;
    }
}
