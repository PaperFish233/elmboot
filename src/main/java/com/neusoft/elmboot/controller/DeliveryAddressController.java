package com.neusoft.elmboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.elmboot.po.DeliveryAddress;
import com.neusoft.elmboot.service.DeliveryAddressService;

@RestController
@RequestMapping("/DeliveryAddressController")
public class DeliveryAddressController {
	
	@Autowired
	private DeliveryAddressService deliveryAddressService;
	
	@RequestMapping("/listDeliveryAddressByUserId")
	public List<DeliveryAddress> listDeliveryAddressByUserId(DeliveryAddress deliveryAddress) {
        return deliveryAddressService.listDeliveryAddressByUserId(deliveryAddress.getUserId());
	}
	
	@RequestMapping("/saveDeliveryAddress")
    public int saveDeliveryAddress(DeliveryAddress deliveryAddress) {
        return deliveryAddressService.saveDeliveryAddress(deliveryAddress);
    }
    
	@RequestMapping("/removeDeliveryAddress")
    public int removeDeliveryAddress(DeliveryAddress deliveryAddress) {
        return deliveryAddressService.removeDeliveryAddress(deliveryAddress.getDaId());
    }
    
	@RequestMapping("/getDeliveryAddressById")
    public DeliveryAddress getDeliveryAddressById(DeliveryAddress deliveryAddress) {
        return deliveryAddressService.getDeliveryAddressById(deliveryAddress.getDaId());
    }
    
	@RequestMapping("/updateDeliveryAddress")
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress) {
        return deliveryAddressService.updateDeliveryAddress(deliveryAddress);
    }

}
