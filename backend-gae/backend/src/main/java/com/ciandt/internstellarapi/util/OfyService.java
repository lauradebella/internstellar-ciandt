package com.ciandt.internstellarapi.util;

import com.ciandt.internstellarapi.entity.Equipe;
import com.ciandt.internstellarapi.entity.Grupo;
import com.ciandt.internstellarapi.entity.Integrante;
import com.ciandt.internstellarapi.entity.Pergunta;
import com.ciandt.internstellarapi.entity.Planeta;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

/**
 * Created by rodrigosclosa on 29/08/16.
 */
public class OfyService {

    static {
        ObjectifyService.register(Equipe.class);
        ObjectifyService.register(Grupo.class);
        ObjectifyService.register(Integrante.class);
        ObjectifyService.register(Planeta.class);
        ObjectifyService.register(Pergunta.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }

}
