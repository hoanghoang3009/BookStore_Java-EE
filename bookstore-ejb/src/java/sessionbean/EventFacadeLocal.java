/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Event;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hoangdd
 */
@Local
public interface EventFacadeLocal {

    void create(Event event);

    void edit(Event event);

    void remove(Event event);

    Event find(Object id);

    List<Event> findAll();

    List<Event> findRange(int[] range);

    int count();
    
}
