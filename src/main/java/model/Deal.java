package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Car cars;
    @ManyToOne
    private Client client;
    //Employ, who operated release a Car and payment
    @ManyToOne
    private Employee employee;
    private Date releaseDate;
    private Date returnDate;
    private  BigDecimal charge;
    @OneToOne
    private Department departmentOut;
    @OneToOne
    private  Department departmentIn;




}