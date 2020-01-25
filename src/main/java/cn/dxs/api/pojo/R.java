package cn.dxs.api.pojo;

import com.alibaba.fastjson.JSONObject;

/**
 * 自定义响应数据接口<br>
 * 这个类是提供给门户，ios，Android，微信商城用的<br>
 * 门户接受此类数据后需要使用本类的方法转换成对应的数据类型格式（类，或者list），其他自行处理
 * 
 * <pre>
 * 0：表示成功
 * 500：表示错误，错误信息在errorMsg字段中
 * 501：bean验证错误，不管多少个错误都以map形式返回
 * 502：拦截器拦截到用户token出错
 * 555：异常抛出信息
 * </pre>
 * 
 * @author lijian
 * @date 2019-07-29 下午4:26:50
 */
public class R extends JSONObject {
	private static final long serialVersionUID = 1L;

	private static final String CODE = "errorCode";
	private static final String MSG = "errorMsg";
	private static final String DATA = "data";

	public R() {
		put(R.CODE, 0);
		put(R.MSG, "OK");
		put(R.DATA, "");
	}

	public static R error() {
		return error(500, "未知异常");
	}

	public static R error(String errorMsg) {
		return error(500, errorMsg);
	}

	public static R error(int errorCode, String errorMsg) {
		R r = new R();
		r.put(R.CODE, errorCode);
		r.put(R.MSG, errorMsg);
		return r;
	}

	public static R ok() {
		return new R();
	}

	public static R ok(Object data) {
		R r = new R();
		r.put(R.DATA, data);
		return r;
	}

	public static R ok(String errorMsg, Object data) {
		R r = new R();
		r.put(R.MSG, errorMsg);
		r.put(R.DATA, data);
		return r;
	}
}
