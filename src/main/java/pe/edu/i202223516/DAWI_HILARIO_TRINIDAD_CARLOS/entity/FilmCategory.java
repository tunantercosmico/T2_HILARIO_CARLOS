package pe.edu.i202223516.DAWI_HILARIO_TRINIDAD_CARLOS.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "film_category")
public class FilmCategory {
    @EmbeddedId
    private CategoryPk categoryPk;
    private Date last_update;

    @ManyToOne
    @JoinColumn(name = "film_id")
    @MapsId("film_id")
    private Film film;
}