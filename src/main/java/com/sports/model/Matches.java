package com.sports.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Matches {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "teamId"))
    Team teamX;

    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "teamId"))
    Team teamY;

    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "teamId"))
    Team winner;

}
