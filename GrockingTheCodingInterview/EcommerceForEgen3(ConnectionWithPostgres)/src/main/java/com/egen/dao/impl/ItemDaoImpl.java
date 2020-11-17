package com.egen.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.egen.dao.beans.Item;
import com.egen.dao.beans.OrderInfo;
import com.egen.dao.ecommerceinterface.ItemDao;
import com.egen.dao.ecommerceinterface.OrderInfoDao;
import com.egen.dao.ecommerceinterface.PaymentInfoDao;

@Component
public class ItemDaoImpl {

	@Autowired
	ItemDao itemInfoDao;

	public Item createOrderInfo(Item newItem) {

		itemInfoDao.save(newItem);

		return newItem;
	}

	public Item findById(Long itemId) {
		 
		return itemInfoDao.findById(itemId).get();
	}
}
