package pe.edu.idat.appwebventasidat.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Table(name = "categories")
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryid;

    @Column(name = "categoryname")
    private String  categoryname;

    @Column(name = "description")
    private String description;
}
