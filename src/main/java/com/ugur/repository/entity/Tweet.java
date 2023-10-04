package com.ugur.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_tweet")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Embedded
    BaseEntity baseEntity;
    String tweetMessage;
    Long userid;
    Long commentCount;
    Long retweetCount;


}
