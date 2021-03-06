/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Fullname;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hoangdd
 */
@Local
public interface FullnameFacadeLocal {

    void create(Fullname fullname);

    void edit(Fullname fullname);

    void remove(Fullname fullname);

    Fullname find(Object id);

    List<Fullname> findAll();

    List<Fullname> findRange(int[] range);

    int count();
    
    int getMaxID();
}
