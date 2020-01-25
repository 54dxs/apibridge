package cn.dxs.api.utils;

/**
 * 系统常量
 * 
 * @author lijian
 * @date 2019-07-28 21:31:53
 */
public class Constant {

	/***************************************************************/
	/** token-相关 *************************************************/
	/***************************************************************/

	/** token-刷新TOKEN(有返回数据) */
	public static final int RESCODE_REFTOKEN_MSG = 1006; // 刷新TOKEN(有返回数据)
	/** token-刷新TOKEN */
	public static final int RESCODE_REFTOKEN = 1007; // 刷新TOKEN

	/** JWT-Token不存在 */
	public static final int JWT_ERRCODE_NULL = 4000; // Token不存在
	/** JWT-Token过期 */
	public static final int JWT_ERRCODE_EXPIRE = 4001; // Token过期
	/** JWT-验证不通过 */
	public static final int JWT_ERRCODE_FAIL = 4002; // 验证不通过

	/** JWT-密钥 */
	public static final String JWT_SECERT = "5n743vokz0b9rtlfwjsexyigmadc2q18"; // 密匙
	/** JWT-token有效时间(单位毫秒，设置一个小时有效期) */
	public static final long JWT_TTL = 60 * 60 * 1000; // token有效时间

	/***************************************************************/
	/** 七牛云相关 *************************************************/
	/***************************************************************/

	/** 七牛云-AK */
	public static final String qiniu_accessKey = "3C4p0ueZRU8b5pbuEfDn9jpoOavZzh1dx4kQNKzf";
	/** 七牛云-SK */
	public static final String qiniu_secretKey = "3QFboA-RKks3DfbncK88Hu9bE1v30W9q-F_iKZY3";
	/** 七牛云-存储空间名 */
	public static final String qiniu_bucket = "s54dxs";
	/** 七牛云-默认域名 */
	public static final String qiniu_domain = "http://pvwwmkyjb.bkt.clouddn.com/";

}
