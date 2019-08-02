package com.chain.oms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.chain.oms.model.ProcessCount;
import com.chain.oms.model.ServiceMasterModel;
import com.chain.oms.model.Users;
import com.chain.oms.service.OrderCreationService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Service
public class OrderCreationServiceImpl implements OrderCreationService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Boolean createOrderManagement(Integer orgId, Object orderAllocationDetails) {
		
		String url = "http://localhost:9094/order/createOrder";
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("orgId", orgId);
		
		HttpEntity<Object> request = new HttpEntity<>(orderAllocationDetails);
		 restTemplate.exchange(uriBuilder.toUriString(),
				  HttpMethod.POST, request, new ParameterizedTypeReference<Boolean>() {});
	
		
		
		
		return null;
	}

	@Override
	public String getOrderCountsByProcess() {
		
		String url = "http://localhost:9094/order/getOrdersCountByProcess";
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url);

		ResponseEntity<List<ProcessCount>> orderByProcessCount = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ProcessCount>>() {
				});
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create(); 

		return gson.toJson(orderByProcessCount.getBody());
	}

	@Override
	public String getServicesByProcessId(Integer processId) {

		String url = "http://localhost:9094/order/getServicesByProcess";
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("processId", processId);
		
		ResponseEntity<List<ServiceMasterModel>> servicesByProcess = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, null,
				new ParameterizedTypeReference<List<ServiceMasterModel>>() {
				});
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create(); 

		return gson.toJson(servicesByProcess.getBody());
		
	}
	
	
	

}
