package com.nit.endpoint;

public class IStockConsumer {
	public static void main(String[] args) {
		IStockServiceImplService stub = new IStockServiceImplService();
		IStockService istock = stub.getIStockServiceImplPort();
		double str = istock.stockProvider("IBM");
		System.out.println(str);
	}
}
