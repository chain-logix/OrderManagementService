package com.chain.oms.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.chain.oms.model.OrderAttachmentsModel;
import com.chain.oms.model.OrderCommentsModel;
import com.chain.oms.model.OrderDetailsModel;
import com.chain.oms.model.OrderInfoModel;
import com.chain.oms.model.OrderProcessingModel;
import com.chain.oms.model.OrderTaxesModel;
import com.chain.oms.service.OrderProcessingService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Service
public class OrderProcessingServiceImpl implements OrderProcessingService{

	

	
	@Override
	public String fetchOrderProcessedDetails(Integer orderId) {
	/*	OrderProcessingModel orderProcessingModel = new OrderProcessingModel();
		List<OrderAttachmentsModel> orderAttachmentsModel = new ArrayList<>();
		List<OrderCommentsModel> orderCommentsModel = new ArrayList<>();
		List<OrderDetailsModel> orderDetailsModel = new ArrayList<>();
		List<OrderTaxesModel>  orderTaxesModel = new ArrayList<>();
		OrderInfoModel orderInfoModel = new OrderInfoModel();
		
		
		
		
		
		
		
		
		Optional<OrderMaster> orderMasterEntity=orderMasterRepository.findById(orderId);
		if(!StringUtils.isEmpty(orderMasterEntity.isPresent()))
		{
			OrderInfoDetailMapping orderInfoDetails = orderMasterRepository.fetchOrderMasterDetails(orderId);
			List<OrderCommentsEntity> orderCommentsEntity =	orderCommentsRepository.findByOrderMaster(orderMasterEntity.get());
			List<OrderAttachmentsEntity> orderAttachmentsEntity =orderAttachmentsRepository.findByOrderMaster(orderMasterEntity.get());
			List<OrderDetailsEntity>  orderDetailsEntity =		orderDetailsRepository.findByOrderMaster(orderMasterEntity.get());
			List<OrderTaxesEntity> orderTaxesEntity=	orderTaxesRepository.findByOrderMaster(orderMasterEntity.get());
		
			if(!StringUtils.isEmpty(orderInfoDetails))
			{
				BeanUtils.copyProperties(orderInfoDetails, orderInfoModel);
			}
			
			if(!CollectionUtils.isEmpty(orderCommentsEntity))
			{
				for (OrderCommentsEntity orderCommentsEntity2 : orderCommentsEntity) {
					OrderCommentsModel comments = new OrderCommentsModel();
				BeanUtils.copyProperties(orderCommentsEntity2, comments);
				orderCommentsModel.add(comments);
				}
			}
			if(!CollectionUtils.isEmpty(orderAttachmentsEntity))
			{
				BeanUtils.copyProperties(orderAttachmentsEntity, orderAttachmentsModel);
			}
			
			if(!CollectionUtils.isEmpty(orderDetailsEntity))
			{
				BeanUtils.copyProperties(orderDetailsEntity, orderDetailsModel);
			}
			
			if(!CollectionUtils.isEmpty(orderTaxesEntity))
			{
				for (OrderTaxesEntity orderTaxesEntity2 : orderTaxesEntity) {
					OrderTaxesModel orderModel = new OrderTaxesModel();
					BeanUtils.copyProperties(orderTaxesEntity2, orderModel);
					orderTaxesModel.add(orderModel);
				}
				
				
			}
			orderProcessingModel.setOrderInfoModel(orderInfoModel);
			orderProcessingModel.setOrderAttachmentsModel(orderAttachmentsModel);
			orderProcessingModel.setOrderCommentsModel(orderCommentsModel);
			orderProcessingModel.setOrderDetailsModel(orderDetailsModel);
			orderProcessingModel.setOrderTaxesModel(orderTaxesModel);
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			return gson.toJson(orderProcessingModel);
	
		}
		
		
		return orderProcessingModel.toString();*/
		return null;
	}

	
}
