module covideumodular {
	exports service;
	exports model;

	requires com.google.gson;
	requires java.net.http;
	requires lombok;
	
	opens model;
}