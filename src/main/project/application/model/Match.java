package application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Match {
    @Id
    private UUID id;
    @OneToOne
    @JoinColumn(name = "Players.ID")
    private Player firstPlayer;
    @OneToOne
    @JoinColumn(name = "Players.ID")
    private Player secondPlayer;
    @OneToOne
    @JoinColumn(name = "Players.ID")
    private Player winner;

}
