package com.ugur.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_retweet")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Retweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Embedded
    BaseEntity baseEntity;

    Long tweetid;
    Long userid;
}
