package pe.codegym.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table (schema = "world", name = "country_language")
public class CountryLanguage {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @ManyToOne
    @JoinColumn (name = "country_id")
    private Country country;


    private String language;

    @Column (name = "is_official", columnDefinition = "BIT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isOfficial;


    private double percentage;
}
