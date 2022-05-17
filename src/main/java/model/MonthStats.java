package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonthStats {

    @Id
    private Long id;
    @OneToMany
    private List<Deal> deals;
    @OneToOne
    private Employee bestEmployee;
    @OneToOne
    private Car bestCar;
    @OneToOne
    private Department bestOutDepartment;
    @OneToOne
    private Department bestInDepartment;
    @OneToOne
    private Client bestClient;





}
