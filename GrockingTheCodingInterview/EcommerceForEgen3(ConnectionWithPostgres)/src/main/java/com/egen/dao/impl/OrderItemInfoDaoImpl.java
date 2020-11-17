package com.egen.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.egen.dao.beans.OrderInfo;
import com.egen.dao.beans.OrderItemInfo;
import com.egen.dao.ecommerceinterface.OrderInfoDao;
import com.egen.dao.ecommerceinterface.OrderItemInfoDao;

@Component
public class OrderItemInfoDaoImpl {

	@Autowired
	private OrderItemInfoDao orderItemInfoDao;

	public List<OrderItemInfo> getAllOrderItemInfo(Long id) {

		return orderItemInfoDao.findAllOrderItemInfosById(id);
	}

	public void saveAll(List<OrderItemInfo> orderItemInfoList) {

		orderItemInfoDao.saveAll(orderItemInfoList);
	}
}
