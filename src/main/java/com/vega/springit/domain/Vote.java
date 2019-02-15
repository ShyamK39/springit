package com.vega.springit.domain;

import lombok.*;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Vote extends Auditable {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private short direction;

    @NonNull
    @ManyToOne
    private Link link;

}
