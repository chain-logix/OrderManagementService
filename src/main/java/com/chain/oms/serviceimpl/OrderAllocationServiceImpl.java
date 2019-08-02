package com.chain.oms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.chain.oms.model.OrderAllocationDetails;
import com.chain.oms.model.Users;
import com.chain.oms.utility.OMSConstantsUtility;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Service
public class OrderAllocationServiceImpl implements com.chain.oms.service.OrderAllocationService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public String fetchUsers() {

		String url = "http://localhost:9094/allocationdao/fetchUsersdao";
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url);

		ResponseEntity<List<Users>> st = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Users>>() {
				});


		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(st.getBody());
	}

	@Override
	public String fetchOrders(String orderAssignedStatus) {

		List<OrderAllocationDetails> orders = new ArrayList<>();
		String fetchusersurl = "http://localhost:9094/allocationdao/fetchUsersdao";
		UriComponentsBuilder usersUriBuilder = UriComponentsBuilder.fromHttpUrl(fetchusersurl);

		ResponseEntity<List<Users>> users = restTemplate.exchange(usersUriBuilder.toUriString(), HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Users>>() {
				});

		List<Users>	usrs = users.getBody();

		if (OMSConstantsUtility.REASSIGNED.equals(orderAssignedStatus)) {
			String fetchReAssignOrdersUrl = "http://localhost:9094/allocationdao/fetchOrderAllocationReassign";
			UriComponentsBuilder reassignOrdersuriBuilder = UriComponentsBuilder.fromHttpUrl(fetchReAssignOrdersUrl);

			ResponseEntity<List<OrderAllocationDetails>> reassignorder = restTemplate.exchange(
					reassignOrdersuriBuilder.toUriString(), HttpMethod.GET, null,
					new ParameterizedTypeReference<List<OrderAllocationDetails>>() {
					});

			orders = reassignorder.getBody();
			Users usr = new Users();
			usr.setUserId(0);
			usr.setFirstName("unassign");
			usrs.add(usr);
		} else {
			String fetchAssignOrdersUrl = "http://localhost:9094/allocationdao/fetchOrderAllocation";
			UriComponentsBuilder assignOrdersuriBuilder = UriComponentsBuilder.fromHttpUrl(fetchAssignOrdersUrl);

			ResponseEntity<List<OrderAllocationDetails>> assignorder = restTemplate.exchange(
					assignOrdersuriBuilder.toUriString(), HttpMethod.GET, null,
					new ParameterizedTypeReference<List<OrderAllocationDetails>>() {
					});

			orders = assignorder.getBody();

		}
		
		final List<Users> uss = usrs;
		orders.stream().forEach(ord -> ord.setUsers(uss));

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(orders);

	}

	@Override
	public Boolean allocateOrders(OrderAllocationDetails orderDetails, Integer assignedUserId, Integer workFlowId) {

		String url = "http://localhost:9094/allocationdao/assignUser";
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("assignedUserId", assignedUserId).queryParam("workFlowId", workFlowId);
		
		HttpEntity<Object> request = new HttpEntity<>(orderDetails);
		 restTemplate.exchange(uriBuilder.toUriString(),
				  HttpMethod.POST, request, new ParameterizedTypeReference<Boolean>() {});
		
		return null;
	}

}
