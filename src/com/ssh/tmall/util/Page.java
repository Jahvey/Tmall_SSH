package com.ssh.tmall.util;

/**
 * �����ר���������з�ҳ
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��6��30�� ����7:25:45
* @version 1.0
*/
public class Page {
	/**
	 * ��ʼ��ҳ��
	 */
	private int start;
	
	/**
	 * ÿҳ��ʾ������
	 */
	private int count;
	
	/**
	 * �ܹ��ж���������
	 */
	private int total;
	
	/**
	 * ����
	 */
	private String param;
	
	/**
	 * Ĭ��ÿҳ��ʾ5��
	 */
	private static final int defaultCount=5;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}
	
	
	
	
	
	
	
	
	
}
