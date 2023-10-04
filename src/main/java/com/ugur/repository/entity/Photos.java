package com.ugur.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_photos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Photos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Embedded
    BaseEntity baseEntity;
    String photourl;
    Long tweetid;
}
