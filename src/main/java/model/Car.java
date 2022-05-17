package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer dealId;
    private String mark;
    private String model;
    private String color;
    private BigDecimal rate;
    private BigDecimal income;
    @OneToMany(mappedBy = "Car")
    private List<Deal> deals;
    @OneToOne
    private  Department department;

}

