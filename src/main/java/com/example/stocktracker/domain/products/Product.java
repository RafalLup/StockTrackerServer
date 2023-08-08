package com.example.stocktracker.domain.products;

public record Product(
        long id,
        Long barcode,
        String productName,
        ProductTypeId productTypeId,
        LocationName locationName,
        int Quantity,
        boolean reservation,
        LocationID locationID

        ) {

}
