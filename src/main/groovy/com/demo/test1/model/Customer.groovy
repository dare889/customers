package com.demo.test1.model

import groovy.transform.ToString
import javax.persistence.Entity

@Entity
@ToString
class Customer {
    String ref
    String name
    String addressLine1
    String addressLine2
    String town
    String county
    String country
    String postcode
}
