package com.autoserve.app.constants;

public class ApiUrlConstants {
	private static final String API_BASE = "http://localhost:8000/api/";
	
	/* API URLs for Address
	 * --------------------*/ 
	private static final String ADDRESS_LEVEL = API_BASE + "address/";
	private static final String ADDRESS_LIST = ADDRESS_LEVEL + "list";
	private static final String ADDRESS_BY_ID = ADDRESS_LEVEL + "{id}";
	private static final String ADDRESS_BY_USER_ID = ADDRESS_LEVEL + "{userId}";
	
	
	/* API URLs for User
	 * ------------------*/ 
	private static final String USER_LEVEL = API_BASE + "user/";
	private static final String USER_LIST = USER_LEVEL + "list";
	private static final String USER_BY_ID = USER_LEVEL + "{id}";
	private static final String USER_BY_FULLNAME = USER_LEVEL + "{fullName}";
	
	/* API URLs for Tables
	 * -------------------*/
	private static final String TABLES_LEVEL = API_BASE + "table/";
	// List of all tables in a restaurant
	private static final String TABLES_BY_RESTAURANT_ID = TABLES_LEVEL + "list/restaurant/{restaurantId}"; 
	// Specific table of a specific Restaurant
	private static final String TABLES_BY__NO_AND_RESTAURANT_ID = TABLES_LEVEL + "{tableNo}restaurant/{id}";
	// Specific table by QR Code
	private static final String TABLES_BY_QR_CODE = TABLES_LEVEL + "qrcode/{qrCode}"; 
	// Specific table by table id
	private static final String TABLES_BY_ID = TABLES_LEVEL + "{id}";
	// Specific table by user id
	private static final String TABLES_BY_USER_ID = TABLES_LEVEL + "user/{userId}";
	
	// API URLs for Orders
	private static final String ORDERS_LEVEL = API_BASE + "order/";
	private static final String ORDER_LIST = ORDERS_LEVEL + "list";
	private static final String ORDERS_BY_ID = ORDERS_LEVEL + "{id}";
	// This will give all orders by a specific user
	private static final String ORDERS_BY_USER_ID = ORDERS_LEVEL + "list/user/{userId}";
	// This endpoint will get all the restaurants orders by the order status
	private static final String ORDERS_BY_ORDER_STATUS = ORDERS_LEVEL + "orderStatus/{orderStatus}";
	// This will give us all the orders by a restaurant and the order status
	private static final String ORDERS_BY_ORDER_STATUS_BY_RESTAURANT_ID = ORDERS_BY_ORDER_STATUS + "/restaurant/{restaurantId}";
	// This will give us all the orders of a specific restaurant
	private static final String ORDERS_BY_RESTAURANT_ID = ORDERS_LEVEL + "list/restaurant/{restaurantId}";
	
	// API URLs for Cart
	private static final String CART_LIST = API_BASE + "cart/all";
	private static final String CART_BY_ID = API_BASE + "cart/{id}";
	
	// API URLs for Item
	// API URLs for Deal
	// API URLs for Category
	// API URLs for Favorite
	// API URLs for Setting
	// API URLs for Role
	// API URLs for Restaurant
	
}
