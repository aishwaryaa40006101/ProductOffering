package com.pccw.ProductOfferingServicebff.controller;

import com.pccw.ProductOfferingServicebff.dto.ProductOffer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductOfferingRestController {
    
    @RequestMapping(value="/productOffering", method= RequestMethod.POST)
    ResponseEntity<ProductOffer> productOffering(@RequestBody ProductOffer productOffer){

        return null;
    }

    @RequestMapping(value="/productOffering/{id}",method=RequestMethod.GET)
    ResponseEntity<List<ProductOffer>> productOffering(@RequestParam("filterParam") Object pFilterParam){

        return null;
    }
    
    @RequestMapping(value="/productOffering/{id}",method=RequestMethod.PATCH)
    ResponseEntity<ProductOffer> productOfferingUpdate(@RequestBody ProductOffer productOffer){
        return null;
    }
    
    @RequestMapping(value="/productOffering/{id}",method=RequestMethod.DELETE)
    ResponseEntity<List<ProductOffer>> productOffering(@RequestParam("id") Integer pProductOfferId){
        return null;
    }
}
