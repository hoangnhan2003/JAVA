package CaseStudy.ManageResort.repository.IFaculity;

import java.util.List;

public interface IFaculity<E> {
    void add(E newFaculity);
    void delete(int index);
    List<E> Search(float price);
    void update();
    List<E> getData();

}
