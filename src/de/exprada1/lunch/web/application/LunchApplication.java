package de.exprada1.lunch.web.application;

import org.restlet.*;
public class LunchApplication  extends Application {


        @Override
        public Restlet createInboundRoot() {
            return new ApplicationRouter(getContext());
        }

}
