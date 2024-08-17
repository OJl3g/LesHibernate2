package org.OJl3g.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "autos")
@Data
@NoArgsConstructor
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String model;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "engine_id", nullable = false)
    private Engine engine;

    public Auto(long id, String model, Engine engine) {
        this.id = id;
        this.model = model;
        this.engine = engine;
    }
}
