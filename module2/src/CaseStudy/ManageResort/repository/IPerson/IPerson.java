package CaseStudy.ManageResort.repository.IPerson;

import java.util.List;

public interface IPerson<E> {
    void add(E person);
    void delete(E person);
    int search(int id);
    List<E> getAll();

}
