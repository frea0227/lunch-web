package de.exprada1.lunch.web.application;

import org.restlet.*;
import org.restlet.routing.*;


public class ApplicationRouter extends Router {
    public ApplicationRouter(Context context) {
        super(context);
        attachPublicResources();
    }


    private void attachPublicResources() {
        attach("/public/meals", MealsResource.class);
    }
}