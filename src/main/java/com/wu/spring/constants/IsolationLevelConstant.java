package com.wu.spring.constants;

/**
 * @author Cactus
 * 隔离等级常量。
 */
public class IsolationLevelConstant {
	
	public static final int TRANSACTION_NONE = 0;
	
	public static final int TRANSACTION_READ_UNCOMMITTED = 1;
	
	public static final int TRANSACTION_READ_COMMITTED = 2;
	
	public static final int TRANSACTION_REPEATABLE_READ = 4;
	
	public static final int TRANSACTION_SERIALIZABLE = 8;
}
