package ${package};

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EntityManagerProducer {
    @PersistenceContext(unitName = "prod")
    private EntityManager em;
    
    @Produces // you can also make this @RequestScoped
    @ApplicationScoped
    public EntityManager create() {
        return em;
    }
}