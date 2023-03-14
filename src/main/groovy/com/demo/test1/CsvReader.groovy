package com.demo.test1

import com.demo.test1.model.Customer
import com.fasterxml.jackson.databind.MappingIterator
import com.fasterxml.jackson.dataformat.csv.CsvMapper
import com.fasterxml.jackson.dataformat.csv.CsvSchema

class CsvReader {

    File file

    CsvReader(String filename) {
        file = new File(filename)
    }

    List<Customer> readCustomers() {
        CsvSchema schema = CsvSchema.emptySchema().withHeader()
        CsvMapper mapper = new CsvMapper()
        MappingIterator<Customer> it = mapper.readerWithSchemaFor(Customer.class).with(schema).readValues(file)
        return it.readAll()
    }
}