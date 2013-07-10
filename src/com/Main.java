package com;

public class Main {

    public static void get(String dest, String getStr) {
    	String s = SendHttp.sendGet(dest, getStr);
        System.out.println("get发送完毕!");
        System.out.println(s);
    }
    
    public static void post(String dest, String msgXml) {
    	String s = SendHttp.sendPost(dest, msgXml);
        System.out.println("发送完毕");
        System.out.println(s);
    }
    public static void main(String[] args) {
    	String dest = "http://127.0.0.1:8080/robot-demo/servlet/weixinrobot";
    	String msgXml = "<xml>\n" +
	        "<ToUserName><![CDATA[gh_1ad0d508f75]]></ToUserName>\n" +
	        "<FromUserName><![CDATA[o7LbXjsg_wdw9TYYzek9FOy9x4y]]></FromUserName>\n" +
	        "<CreateTime>1365073034</CreateTime>\n" +
	        "<MsgType><![CDATA[text]]></MsgType>\n" +
	        "<Content><![CDATA[高沙 九溪]]></Content>\n" +
	        "<MsgId>5862944037781496076</MsgId>\n" +
	        "</xml>";
        
    	String getStr = "signature=123&timestamp=3456789&nonce=4578&echostr=eee";
    	//发送 GET 请求
//        get(dest, getStr);
        //发送 POST 请求
    	post(dest, msgXml);
        
    }
}