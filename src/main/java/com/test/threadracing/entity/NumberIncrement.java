package com.test.threadracing.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author amit
 * below is the entity class for the table number
 */

@Entity
@Table(name="number")
@Data
public class NumberIncrement implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @Column(name="num")
    private Long num;
}
