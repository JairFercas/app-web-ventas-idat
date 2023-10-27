package pe.edu.idat.appwebventasidat.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "orderdetails")
@Entity
@NoArgsConstructor
@Data
public class OrderDetail {

    @Column(name = "unitprice" )
    private Double unitprice;
    @Column(name = "quantity" )
    private Integer quantity;
    @Column(name = "discount" )
    private Double discount;

    @ManyToOne
    @JoinColumn(name = "orderid")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "productid")
    private Product product;
}
