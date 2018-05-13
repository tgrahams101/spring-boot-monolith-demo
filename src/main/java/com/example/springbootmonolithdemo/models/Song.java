package com.example.springbootmonolithdemo.models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity
@Table(name="SONGS")
public class Song {
    public Song(String title, Float length){
        this.title = title;
        this.length = length;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "FIRST_NAME")
    private Float length;
}
