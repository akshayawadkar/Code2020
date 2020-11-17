package com.egen.dao.ecommerceinterface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egen.dao.beans.Item;
import com.egen.dao.beans.OrderInfo;
import com.egen.dao.beans.OrderItemInfo;

@Repository
public interface ItemDao extends JpaRepository<Item, Long> {
	
	 

}
