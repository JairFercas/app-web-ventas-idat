package pe.edu.idat.appwebventasidat.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "orders")
@Entity
@NoArgsConstructor
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderid;

    @Column(name = "orderdate" )
    private String orderdate;
    @Column(name = "requireddate" )
    private String requireddate ;
    @Column(name = "shippeddate" )
    private String shippeddate;
    @Column(name = "shipvia" )
    private Integer shipvia;
    @Column(name = "freight" )
    private Double freight;
    @Column(name = "shipname" )
    private String shipname;
    @Column(name = "shipaddress" )
    private String shipaddress;
    @Column(name = "shipcity" )
    private String shipcity;
    @Column(name = "shipregion" )
    private String shipregion;
    @Column(name = "shippostalcode" )
    private String shippostalcode;
    @Column(name = "shipcountry" )
    private String shipcountry;

    @Column(name = "customerid" )
    private Customer customer;
    @Column(name = "employeeid" )
    private Employee employee;
}
