package com.demo.test1

import spock.lang.Specification
import spock.lang.Unroll

class CsvReaderSpec extends Specification {

    def "should read in CSV file and parse into a list of customers"() {
        given:
        def customerCsvReader = new CsvReader("src/test/resources/Customer.csv")

        when:
        def customers = customerCsvReader.readCustomers()

        then:
        customers.size() == 3
        customers[0].ref == "C001"
        customers[0].name == "John Smith"
        customers[0].addressLine1 == "123 Main St"
        customers[0].addressLine2 == ""
        customers[0].town == "London"
        customers[0].county == "Middlesex"
        customers[0].country == "UK"
        customers[0].postcode == "SW1A 1AA"

        customers[1].ref == "C002"
        customers[1].name == "Jane Doe"
        customers[1].addressLine1 == "456 High St"
        customers[1].addressLine2 == "Apt 2B"
        customers[1].town == "Manchester"
        customers[1].county == "Lancashire"
        customers[1].country == "UK"
        customers[1].postcode == "M1 1AA"

        customers[2].ref == "C003"
        customers[2].name == "Bob Johnson"
        customers[2].addressLine1 == "789 Low St"
        customers[2].addressLine2 == ""
        customers[2].town == "Birmingham"
        customers[2].county == "Warwickshire"
        customers[2].country == "UK"
        customers[2].postcode == "B1 1AA"

    }
}
