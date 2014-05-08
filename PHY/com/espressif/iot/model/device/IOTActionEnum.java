package com.espressif.iot.model.device;

/*
 * this enum is used to explore the action to the developer
 */
public enum IOTActionEnum {
	/**
	 * IOT Action Local
	 */
	IOT_ACTION_SWITCH_ON,
	IOT_ACTION_SWITCH_OFF,
	IOT_ACTION_GET_SWITCH,
	IOT_ACTION_GET_INFO,
	IOT_ACTION_SET_WIFI_CONFIGURE,
	IOT_ACTION_GET_WIFI_CONFIGURE,
	IOT_ACTION_SET_STA_CONFIGURE,
	IOT_ACTION_SET_SOFTAP_CONFIGURE,
	IOT_ACTION_GET_STA_SOFTAP_CONFIGURE,
	
	/**
	 * IOT Action Internet
	 */
	IOT_ACTION_SWITCH_ON_INTERNET,
	IOT_ACTION_SWITCH_OFF_INTERNET,
	IOT_ACTION_GET_SWITCH_INTERNET,
	IOT_ACTION_GET_TEM_HUM_100_INTERNET,
}
