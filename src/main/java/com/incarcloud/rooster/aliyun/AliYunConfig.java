package com.incarcloud.rooster.aliyun;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AliYunConfig {
	private String _accountId;
	private String _accessKeyId;
	private String _accessKeySecret;

	public String getAccountId() {
		return _accountId;
	}

	@Value("${rooster.aliyun.accountId}")
	public void setAccountId(String value) {
		_accountId = value;
	}

	public String getAccessKeyId() {
		return _accessKeyId;
	}

	@Value("${rooster.aliyun.accessKeyId}")
	public void setAccessKeyId(String value) {
		_accessKeyId = value;
	}

	public String getAccessKeySecret() {
		return _accessKeySecret;
	}

	@Value("${rooster.aliyun.accessKeySecret}")
	public void setAccessKeySecret(String value) {
		_accessKeySecret = value;
	}

	// TODO: MNS OTS config
	private String _mnsEndpoint;
	private String _mnsQueue;
	private String _mnsTopic;
	private int maxConnectionsPerRoute;
	private int maxConnections;

	public String getMnsEndpoint() {
		return _mnsEndpoint;
	}

	@Value("${rooster.aliyun.MNS.endpoint}")
	public void setMnsEndpoint(String mnsEndpoint) {
		this._mnsEndpoint = mnsEndpoint;
	}

	public String getMnsQueue() {
		return _mnsQueue;
	}

	@Value("${rooster.aliyun.MNS.queue}")
	public void setMnsQueue(String _mnsQueue) {
		this._mnsQueue = _mnsQueue;
	}

	public String getMnsTopic() {
		return _mnsTopic;
	}

	@Value("${rooster.aliyun.MNS.topic}")
	public void setMnsTopic(String _mnsTopic) {
		this._mnsTopic = _mnsTopic;
	}

	public int getMaxConnectionsPerRoute() {
		return maxConnectionsPerRoute;
	}

	@Value("${rooster.aliyun.MNS.maxConnectionsPerRoute}")
	public void setMaxConnectionsPerRoute(int maxConnectionsPerRoute) {
		this.maxConnectionsPerRoute = maxConnectionsPerRoute;
	}

	public int getMaxConnections() {
		return maxConnections;
	}

	@Value("${rooster.aliyun.MNS.maxConnections}")
	public void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}

}
