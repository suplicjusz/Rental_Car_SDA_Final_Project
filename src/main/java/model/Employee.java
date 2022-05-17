package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Deal> deals;
    @OneToOne
    private Department departmentOfEmployee;

    //equals & hashcode!

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(deals, employee.deals) && Objects.equals(departmentOfEmployee, employee.departmentOfEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, deals, departmentOfEmployee);
    }
}