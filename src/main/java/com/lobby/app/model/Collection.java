package com.lobby.app.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="collection")
public class Collection {

    //dwadawdwa
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private Game game;

    @Column(name="collection_status")
    @Enumerated(EnumType.STRING)
    private CollectionStatus status;

    public Collection(User user, Game game, CollectionStatus status) {
        this.user = user;
        this.game = game;
        this.status = status;
    }

}
