/**
 * Copyright 2019 Huawei Technologies Co.,Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.obs.services.model;

/**
 *
 * 重定向协议
 *
 */
public enum ProtocolEnum {
	
	/**
	 * 重定向时使用HTTP协议
	 */
	HTTP("http"),

	/**
	 * 重定向时使用HTTPS协议
	 */
	HTTPS("https");

	private String code;

	private ProtocolEnum(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public static ProtocolEnum getValueFromCode(String code) {
		for (ProtocolEnum val : ProtocolEnum.values()) {
			if (val.code.equals(code)) {
				return val;
			}
		}
		return null;
	}
}
